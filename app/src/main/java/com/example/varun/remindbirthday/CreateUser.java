package com.example.varun.remindbirthday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateUser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_user);
        final EditText name=findViewById(R.id.name);
        final EditText dob=findViewById(R.id.dob);
        final EditText contact=findViewById(R.id.contact);
        Button save=findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            private static final String TAG ="CreateUser" ;

            @Override
            public void onClick(View v) {
                Log.e(TAG, "onClick: Name"+name.getText().toString());
                Log.e(TAG, "onClick: dob"+dob.getText().toString());
                Log.e(TAG, "onClick: contact"+contact.getText().toString());
            }
        });
    }
}
