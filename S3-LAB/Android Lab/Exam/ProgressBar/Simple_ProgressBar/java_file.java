package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity {
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doProgress();
    }

    // ProgressBar update
    public void doProgress() {
        progressBar = findViewById(R.id.progressbar);
        for (int i = 0; i <= 100; i++) {
            progressBar.setProgress(i);
        }
    }

}