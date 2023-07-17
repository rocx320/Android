package com.example.activitylifecycle_lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
    }
    public void sendLogcat(View view) {
        Intent i = new Intent(splashScreen.this, screen2.class);
        startActivity(i);
    }
}