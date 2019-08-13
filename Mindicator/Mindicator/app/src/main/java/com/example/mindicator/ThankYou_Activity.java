package com.example.mindicator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;

public class ThankYou_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_thank_you_ );


        Handler handler = new Handler();

        handler.postDelayed( new Runnable() {
            public void run() {
                finish();
            }
        }, 2000 );


    }
}

