package com.example.foody;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash_Screen extends AppCompatActivity {

    private static final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

       new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent itent = new Intent(Splash_Screen.this, MainActivity.class);
                startActivity(itent);

            }
        },SPLASH_DISPLAY_LENGTH);

    }
}