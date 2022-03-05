package com.example.pract;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        b2=(Button) findViewById(R.id.button);
        // ed=(EditText)findViewById(R.id.edtxt1);

        // ed.setText("sdsdsd");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //s1= ed.getText().toString();
                Intent i=new Intent(MainActivity2.this,MainActivity.class);
                startActivity(i);
                // Toast.makeText(MainActivity.this, s1, Toast.LENGTH_SHORT).show();

            }
        });
    }
}