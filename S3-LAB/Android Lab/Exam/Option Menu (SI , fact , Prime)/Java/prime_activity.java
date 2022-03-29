package com.example.pro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class prime_activity extends AppCompatActivity {
    Button si;
    EditText no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime);
        si = findViewById(R.id.calculate);
        no = findViewById(R.id.no);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = Integer.parseInt(no.getText().toString());
                if(isPrime(num))
                    Toast.makeText(prime_activity.this,"Prime",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(prime_activity.this,"Not Prime",Toast.LENGTH_LONG).show();
            }
        });
    }

    public boolean isPrime(int num){
        for(int i = 2; i<=Integer.parseInt(String.valueOf(num/2)); i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
}