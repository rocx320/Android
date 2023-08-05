package com.example.app_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){
        Intent intent = new Intent(this, com.example.app_lab3.InfoFill.class);

        EditText username = findViewById(R.id.username);
        EditText password = findViewById(R.id.password);

        if(!username.getText().toString().equalsIgnoreCase("") && password.getText().toString().equalsIgnoreCase("admin")){
            String message = "Welcome "+username.getText().toString();
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

            intent.putExtra("username", username.getText().toString());

            startActivity(intent);
        }
        else{
            Toast.makeText(this, "Wrong Credentials, Try Again!", Toast.LENGTH_SHORT).show();
        }
    }
}