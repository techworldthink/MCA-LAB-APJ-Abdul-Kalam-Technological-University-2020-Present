package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Double total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        total=0.0;
    }

    // CheckBox onClick event handle
    public void checkClick(View view){
        CheckBox checkbox = (CheckBox)view;
        boolean  ischeck = checkbox.isChecked();
        switch(checkbox.getId()){
            case R.id.check_100:
                if(ischeck) total+=100;
                else total-=100;
                break;
            case R.id.check_200:
                if(ischeck) total+=200;
                else total-=200;
                break;
            case R.id.check_300:
                if(ischeck) total+=300;
                else total-=300;
                break;
            case R.id.check_400:
                if(ischeck) total+=400;
                else total-=400;
                break;
            case R.id.check_500:
                if(ischeck) total+=500;
                else total-=500;
                break;
            default:
                break;
        }
        Toast.makeText(MainActivity.this,"Total : "+total,Toast.LENGTH_LONG).show();
    }


}