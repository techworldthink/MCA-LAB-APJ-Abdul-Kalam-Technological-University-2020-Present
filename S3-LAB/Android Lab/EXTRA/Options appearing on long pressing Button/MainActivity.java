package com.example.myapp_ws2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button) findViewById(R.id.button);
        registerForContextMenu(btn);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");//tiyle name for options
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),0,"Search");
        menu.add(0,v.getId(),0,"Share");
        menu.add(0,v.getId(),0,"Bookmark");
        menu.add(0,v.getId(),0,"Print");
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Toast.makeText(this,"Selected item "+item.getTitle(),Toast.LENGTH_SHORT).show();
        return true;
    }
}