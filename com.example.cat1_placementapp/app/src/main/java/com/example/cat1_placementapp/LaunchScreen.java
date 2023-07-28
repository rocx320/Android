package com.example.cat1_placementapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class LaunchScreen extends AppCompatActivity {
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_screen);

        TextView textView = findViewById (R.id.textView4);
        iv = findViewById(R.id.imageView);
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            String name = (String) extras.get("name");
            textView.setText(name);
        }

        Button btn1 = findViewById(R.id.button2);
        btn1.setOnClickListener(v -> Toast.makeText(getBaseContext(), "Good Luck For your Placements!" , Toast.LENGTH_SHORT ).show());
        iv.setOnClickListener(v -> {
            Intent i1 = new Intent().setData(Uri.parse("https://www.linkedin.com/in/piyush-rai-163989215/"));
            startActivity(i1);
        });

        Button btn2 = findViewById(R.id.button3);
        btn2.setOnClickListener(v -> {
            Intent change = new Intent(LaunchScreen.this,Image_select.class);
            startActivity(change);
        });
    }

}