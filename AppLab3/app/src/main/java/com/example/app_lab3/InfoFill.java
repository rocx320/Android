package com.example.app_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class InfoFill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_fill);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        EditText regNo = findViewById(R.id.reg_no);
        EditText email = findViewById(R.id.email);
        EditText className = findViewById(R.id.className);


        TextView welcomeUser = findViewById(R.id.welcomeUser);
        welcomeUser.setText("Welcome "+username);

    }

    public void nextStep(View view){

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        EditText regNo = findViewById(R.id.reg_no);
        EditText email = findViewById(R.id.email);
        EditText className = findViewById(R.id.className);


        Intent nextIntent = new Intent(this, com.example.app_lab3.SocialFIll.class);

        if (!regNo.getText().toString().equals("") && !email.getText().toString().equals("") && !className.getText().toString().equals(""))
        {
            nextIntent.putExtra("regNo", regNo.getText().toString());
            nextIntent.putExtra("email", email.getText().toString());
            nextIntent.putExtra("className", className.getText().toString());
            nextIntent.putExtra("username", username);

            startActivity(nextIntent);
        }
        else {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
        }
    }

}
