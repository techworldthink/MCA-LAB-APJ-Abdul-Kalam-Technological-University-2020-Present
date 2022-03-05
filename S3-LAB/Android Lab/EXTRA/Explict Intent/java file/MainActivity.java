package com.example.background;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.btn);

        b.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);

            }
        });
    }
}
