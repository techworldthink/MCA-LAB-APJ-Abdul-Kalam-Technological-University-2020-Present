package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;


public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 0;
        doProgress();
    }

    // ProgressBar update
    public void doProgress() {
        progressBar = findViewById(R.id.progressbar);
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                counter++;
                progressBar.setProgress(counter);
                if (counter == 100) {
                    t.cancel();
                }
            }
        };
        //schedule the timer, after the first 0ms the TimerTask will run every 100ms
        t.schedule(tt, 0, 100);
    }

}