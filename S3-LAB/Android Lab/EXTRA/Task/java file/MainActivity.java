package com.example.andproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText user;
    EditText pass;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user=(EditText)findViewById(R.id.usr);
        pass=(EditText)findViewById(R.id.pwd);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String userget = user.getText().toString();
                String passget = pass.getText().toString();

               if ((userget.equals("admin")) && (passget.equals("admin"))) {
                   Intent i = new Intent(MainActivity.this, MainActivity2.class);
                   startActivity(i);
               }

               else {
                  Toast.makeText(MainActivity.this,"Login Error",Toast.LENGTH_SHORT).show();
               }
                }
        });

    }
}