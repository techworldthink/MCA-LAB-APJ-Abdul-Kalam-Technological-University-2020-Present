package com.example.ex_13;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Fetching values into the bundle
        Bundle extras=getIntent().getExtras();

        //Extracting the string with id val_1
        String v1= extras.getString("val_1");

        t=(TextView) findViewById(R.id.textView);
        t.setText(t.getText()+" "+v1);
    }
}
