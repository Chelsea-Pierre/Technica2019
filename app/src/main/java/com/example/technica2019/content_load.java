package com.example.technica2019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class content_load extends AppCompatActivity {
private static int SPLASH_TIME_OUT = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_load);

        new Handler().postDelayed(new Runnable(){

            @Override
                    public void run (){
                Intent intent = new Intent(content_load.this, content_assignments.class);
                startActivity(intent);
                finish();
            }

        }, SPLASH_TIME_OUT);
    }
}
