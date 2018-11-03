package com.example.varun.remindbirthday;

import android.arch.persistence.room.Entity;


public class User {

    public User(String name, String dob, String contact) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
    }

    private  int id;

    private String name;

    private String dob;

    private String contact;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
