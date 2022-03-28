package com.example.pro;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menures,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this,item.getTitle(),Toast.LENGTH_SHORT).show();
        switch(item.getItemId()){
            case R.id.si:
                Intent i = new Intent(MainActivity.this,si_activity.class);
                startActivity(i);
                break;
            case R.id.fact:
                Intent j = new Intent(MainActivity.this,fact_activity.class);
                startActivity(j);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;
    }
}