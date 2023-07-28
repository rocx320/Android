package com.example.cat1_placementapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class Image_select extends AppCompatActivity {
    ImageSwitcher imgsw;
    Button prev,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_select);

        imgsw = findViewById(R.id.imgsw);
        prev = findViewById(R.id.button5);
        next = findViewById(R.id.button4);

        imgsw.setFactory(() -> {
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        });

        prev.setOnClickListener(v -> imgsw.setImageResource(R.drawable.manager));

        next.setOnClickListener(v -> imgsw.setImageResource(R.drawable.software));

        FloatingActionButton fabNotification = findViewById(R.id.fabNotification);
        fabNotification.setOnClickListener(view -> showNotificationSnackbar());
    }

    private void showNotificationSnackbar() {
        Snackbar snackbar = Snackbar.make(findViewById(R.id.linear), "Notification Message!", Snackbar.LENGTH_LONG);
        snackbar.show();
    }
}