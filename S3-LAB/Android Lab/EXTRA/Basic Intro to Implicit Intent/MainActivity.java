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
    //EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.btn);
        //et=(EditText) findViewById(R.id.edtxt);
        b.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                //String s= et.getText().toString();
                Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("https://google.com"));
                startActivity(i);
                //Toast.makeText(MainActivity.this, s1, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
