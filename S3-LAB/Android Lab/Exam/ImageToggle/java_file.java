package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    ToggleButton btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.image);
        btn = findViewById(R.id.button);

        img.setImageDrawable(getResources().getDrawable(R.drawable.one));
    }

    public void click(View view){
        if(btn.isChecked()){
            img.setImageDrawable(getResources().getDrawable(R.drawable.two));
        }else{
            img.setImageDrawable(getResources().getDrawable(R.drawable.one));
        }
    }


}