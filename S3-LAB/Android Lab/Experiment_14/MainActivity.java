package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_URL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_URL = (Button)findViewById(R.id.browse);
        btn_URL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.co.in"));
                startActivity(newintent);
            }
        });
    }
}