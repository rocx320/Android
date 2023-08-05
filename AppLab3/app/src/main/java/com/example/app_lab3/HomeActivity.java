package com.example.app_lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Intent intent = getIntent();
        String regNo = intent.getStringExtra("regNo");
        String Email = intent.getStringExtra("email");
        String classname = intent.getStringExtra("className");
        String username = intent.getStringExtra("username");

        TextView userName = findViewById(R.id.textView);
        TextView reg_no = findViewById(R.id.textView2);
        TextView className = findViewById(R.id.textView4);
        TextView email = findViewById(R.id.textView5);

        userName.setText(username);
        reg_no.setText(regNo);
        email.setText(Email);
        className.setText(classname);
    }

    public void openInstagram(View view){
        Intent intent = getIntent();
        String insta = intent.getStringExtra("insta");

        Intent openInsta = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/"+insta));
        startActivity(openInsta);
    }

    public void openGithub(View view){
        Intent intent = getIntent();
        String github = intent.getStringExtra("github");

        Intent openGit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/"+github));
        startActivity(openGit);
    }

    public void openLinkedIn(View view){
        Intent intent = getIntent();
        String link = intent.getStringExtra("linkedIn");

        Intent openLink = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/"+link));
        startActivity(openLink);
    }

    public void openTwitter(View view){
        Intent intent = getIntent();
        String twitter = intent.getStringExtra("twitter");

        Intent openTwit = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/"+twitter));
        startActivity(openTwit);
    }

    public void logout(View view){
        Intent logout = new Intent(this, com.example.app_lab3.MainActivity.class);
        startActivity(logout);
    }
}
