package com.example.varun.remindbirthday;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class User {

    public User(String name, String dob, String contact) {
        this.name = name;
        this.dob = dob;
        this.contact = contact;
    }
    @PrimaryKey(autoGenerate = true)
    private  int id;
    @ColumnInfo(name = "Name")
    private String name;
    @ColumnInfo(name = "Dob")
    private String dob;
    @ColumnInfo(name = "contact")
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
