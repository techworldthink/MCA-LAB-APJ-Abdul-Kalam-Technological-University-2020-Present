package com.example.onclickmethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void clickmethod(View view){
        Toast.makeText(this,"You are always welcome",Toast.LENGTH_SHORT).show();
    }
}
