package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginBtn = findViewById(R.id.login);
        EditText usernameText = findViewById(R.id.user);
        EditText passwordText = findViewById(R.id.pass);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = usernameText.getText().toString();
                String pass = passwordText.getText().toString();

                if (user.equals("admin") && pass.equals("admin")) {
                    message("Login successfull...");
                } else {
                    message("Login Failed...");
                }
            }
        });

    }

    public void message(String msge) {
        Toast.makeText(this, msge, Toast.LENGTH_SHORT).show();
    }
}