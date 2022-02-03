package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void select(View view){
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()){
            case R.id.checkI:
                if(checked)
                    displayMessage("Selected INDIA");
                break;
            case R.id.checkS:
                if(checked)
                    displayMessage("Selected SRILANKA");
        }
    }

    public void displayMessage(String content){
        Toast.makeText(this,content,Toast.LENGTH_SHORT).show();
    }
}