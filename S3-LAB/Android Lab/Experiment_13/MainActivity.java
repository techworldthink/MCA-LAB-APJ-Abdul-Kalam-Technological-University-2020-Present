package com.example.ex_13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.btnxt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=new Intent(MainActivity.this,MainActivity2.class);
                //passing the value Hello using the variavle val_1
                i.putExtra("val_1","Hello!!!");
                startActivity(i);
            }
        });

    }
}
