package com.example.foody;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Method;

public class Done extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_LENGTH = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_done);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent itent = new Intent(Done.this, ShopActivity.class);
                startActivity(itent);

            }
        },SPLASH_DISPLAY_LENGTH);

    }
}