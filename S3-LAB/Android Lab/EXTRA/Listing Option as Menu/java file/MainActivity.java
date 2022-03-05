package com.example.wsday2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menures,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //return super.onOptionsItemSelected(item);
        Toast.makeText(this, "Selected Item "+item.getTitle(), Toast.LENGTH_SHORT).show();
        switch (item.getItemId()){
            case R.id.search_item:
                Intent intent = new Intent(MainActivity.this,intent.class);
                startActivity(intent);
                return true;
            case R.id.upload_item:
                //do ur code
                return true;
            case R.id.copy_item:
                //do ur code
                return true;
            case R.id.print_item:
                //do ur code
                return true;
            case R.id.share_item:
                //do ur code
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
