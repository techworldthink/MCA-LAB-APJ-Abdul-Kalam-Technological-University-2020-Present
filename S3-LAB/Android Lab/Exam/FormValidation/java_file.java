package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText name,email,pnum,pass;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.name);
        email=(EditText) findViewById(R.id.email);
        pnum=(EditText) findViewById(R.id.pnum);
        pass=(EditText) findViewById(R.id.pass);

        button =(Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //fetch the values entered
                String n=name.getText().toString();
                String e=email.getText().toString();
                String num=pnum.getText().toString();
                String p=pass.getText().toString();

                //make function for validation and pass all parameters
                boolean checked= validateinfo(n,e,num,p);
                if(checked==true){
                    Toast.makeText(getApplicationContext(), "Data is valid", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Sorry,check the information again", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateinfo(String n, String e, String num, String p) {
        if (n.length() == 0) {
            name.requestFocus();
            name.setError("Name field cannot be empty");
            return false;
        } else if (!n.matches("[a-zA-Z]+")) {
            name.requestFocus();
            name.setError("Enter only alphebetical Character");
            return false;
        } else if (e.length() == 0) {
            email.requestFocus();
            email.setError("email field cannot be empty");
            return false;
        } else if (!e.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")) {
            email.requestFocus();
            email.setError("Enter valid email");
            return false;
        } else if (num.length() == 0) {
            pnum.requestFocus();
            pnum.setError("Phone number cannot be empty");
            return false;
        } else if (!num.matches("^[+][0-9]{10,13}$")) {
            pnum.requestFocus();
            pnum.setError("Enter valid phone number");
            return false;
        } else if (p.length() <= 5) {
            pass.requestFocus();
            pass.setError("Minimum 6 charactes required");
            return false;
        } else {
            return true;
        }


    }
}