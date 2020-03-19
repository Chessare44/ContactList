package com.example.contactlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Write a message to the database

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
