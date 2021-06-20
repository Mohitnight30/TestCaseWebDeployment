package com.example.nearbygrocer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class view extends AppCompatActivity {
    private static int Splash_time = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent (view.this,MainActivity.class);
                startActivity(intent);
                view.this.finish();
            }
        }, Splash_time);
    }

}