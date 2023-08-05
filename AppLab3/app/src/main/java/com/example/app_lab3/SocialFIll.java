package com.example.app_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SocialFIll extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_fill);
    }

    public void finish(View view){
        Intent intent = getIntent();
        String regNo = intent.getStringExtra("regNo");
        String email = intent.getStringExtra("email");
        String className = intent.getStringExtra("className");
        String username = intent.getStringExtra("username");
        EditText insta = findViewById(R.id.editTextText);
        EditText github = findViewById(R.id.editTextText2);
        EditText linkedIn = findViewById(R.id.editTextText3);
        EditText twitter = findViewById(R.id.editTextText4);
        Intent nextIntent = new Intent(this, com.example.app_lab3.HomeActivity.class);

        nextIntent.putExtra("insta", insta.getText().toString());
        nextIntent.putExtra("github", github.getText().toString());
        nextIntent.putExtra("linkedIn", linkedIn.getText().toString());
        nextIntent.putExtra("twitter", twitter.getText().toString());
        nextIntent.putExtra("regNo", regNo);
        nextIntent.putExtra("email", email);
        nextIntent.putExtra("className", className);
        nextIntent.putExtra("username", username);

        startActivity(nextIntent);
    }
}
