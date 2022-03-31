package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extra = getIntent().getExtras();
        String text = extra.getString("name");
        String text2 = extra.getString("name2");
        Toast.makeText(this,text,Toast.LENGTH_LONG).show();
        Toast.makeText(this,text2,Toast.LENGTH_LONG).show();
    }
}