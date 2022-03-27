package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        select=0;
    }

    // CheckBox onClick event handle
    public void radioClick(View view){
        RadioButton radiobox = (RadioButton)view;
        boolean  ischeck = radiobox.isChecked();
        switch(radiobox.getId()){
            case R.id.radio_100:
                if(ischeck) select=100;
                break;
            case R.id.radio_200:
                if(ischeck) select=200;
                break;
            case R.id.radio_300:
                if(ischeck) select=300;
                break;
            default:
                break;
        }
        Toast.makeText(MainActivity.this,"Selection is : "+select,Toast.LENGTH_LONG).show();
    }


}