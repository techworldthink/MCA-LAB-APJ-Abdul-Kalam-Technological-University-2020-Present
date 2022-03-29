package com.example.pro;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class fact_activity extends AppCompatActivity {
    Button si;
    EditText no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);
        si = findViewById(R.id.calculate);
        no = findViewById(R.id.no);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(no.getText().toString());
                int res =1;
                while(num != 0){
                    res = res*num;
                    num--;
                }
                Toast.makeText(fact_activity.this,"Factorial is "+res,Toast.LENGTH_LONG).show();
            }
        });
    }
}