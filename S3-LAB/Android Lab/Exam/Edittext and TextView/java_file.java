package com.example.pro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText text_pre;
    TextView text_post;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_pre = findViewById(R.id.text_pre);
        text_post = findViewById(R.id.text_post);
    }

    // copy content of edittext to textview
    public void btnClick(View view){
        text_post.setText(text_pre.getText());
    }

}