package com.example.pro;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class si_activity extends AppCompatActivity {
    Button si;
    EditText p,n,r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_si);
        si = findViewById(R.id.calculate);
        p = findViewById(R.id.p);
        n = findViewById(R.id.n);
        r = findViewById(R.id.r);
        si.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double pv = Double.parseDouble(p.getText().toString());
                Double nv = Double.parseDouble(n.getText().toString());
                Double rv = Double.parseDouble(r.getText().toString());
                Double res = (pv*nv*rv)/100;
                Toast.makeText(si_activity.this,"Interest is "+res,Toast.LENGTH_LONG).show();
            }
        });
    }
}