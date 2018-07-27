package com.example.swapnil.timerdemo;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(10000 + 100, 1000) {

            public void onTick(long timeLeft) {
                Log.i("yay", String.valueOf(timeLeft / 1000));
                Toast.makeText(MainActivity.this, "Timer running for 10 seconds", Toast.LENGTH_SHORT).show();
            }

            public void onFinish() {
                Log.i("We are done", "no more counting");
                Toast.makeText(MainActivity.this, "finished", Toast.LENGTH_LONG).show();
            }

        }.start();
    }
}
