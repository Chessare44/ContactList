package com.example.contactlist.views;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.example.contactlist.MainActivity;
import com.example.contactlist.R;

public class SplashActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 2000;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            };
        }, DURACION_SPLASH);

    }

}
