package com.example.test3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bd,be,bp,bs,bm,bq,bac;
    EditText tl;
    String dl=null;
    char op;
    double a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tl=(EditText) findViewById(R.id.display);
        b1=(Button)findViewById(R.id.nl);
        b2=(Button)findViewById(R.id.n2);
        b3=(Button)findViewById(R.id.n3);
        b4=(Button)findViewById(R.id.n4);
        b5=(Button)findViewById(R.id.n5);
        b6=(Button)findViewById(R.id.n6);
        b7=(Button)findViewById(R.id.n7);
        b8=(Button)findViewById(R.id.n8);
        b9=(Button)findViewById(R.id.n9);
        b0=(Button)findViewById(R.id.n0);
        bd=(Button)findViewById(R.id.nd);
        be=(Button)findViewById(R.id.ne);
        bp=(Button)findViewById(R.id.np);
        bs=(Button)findViewById(R.id.ns);
        bm=(Button)findViewById(R.id.nm);
        bq=(Button)findViewById(R.id.nq);
        bac=(Button)findViewById(R.id.ac);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+"0");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                tl.setText(dl+".");
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                a=Double.parseDouble(dl);
                tl.setText(null);
                dl=null;
                op='+';
            }
        });
        bq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                a=Double.parseDouble(dl);
                tl.setText(null);
                dl=null;
                op='/';
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                a=Double.parseDouble(dl);
                tl.setText(null);
                dl=null;
                op='*';
            }
        });
        be.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                dl=tl.getText().toString();
                b=Float.parseFloat(dl);
                switch (op)
                {
                    case '+':
                        c=a+b;
                        break;
                    case '-':
                        c=a-b;
                        break;
                    case '*':
                        c=a*b;
                        break;
                    case '/':
                        c=a/b;
                        break;
                    default:
                }
                tl.setText(String.valueOf(c));
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tl.setText(null);
                a=0;
                b=0;
                c=0;
                dl=null;
            }
        });
    }
}