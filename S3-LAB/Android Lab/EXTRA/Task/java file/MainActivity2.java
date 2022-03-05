package com.example.andproj;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;//note this lib,the right lib might not grt imported
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.widget.MediaController;//if error comes at 49,50th line,note down this lib,as the cause of error might come from importing the wrong lib
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    Button audio;
    Button video;
    Button toast;
    Button alert;
    VideoView vv;
    private Context context=this;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        audio=(Button)findViewById(R.id.audiobtn);
        video=(Button)findViewById(R.id.videobtn);
        toast=(Button)findViewById(R.id.toastbtn);
        alert=(Button)findViewById(R.id.alerbtn);

        audio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(MainActivity2.this, R.raw.abc);
                mp.start();
            }

        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vv=(VideoView) findViewById(R.id.vview);
                MediaController Mc = new MediaController(MainActivity2.this);
                Uri uri= Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vbn);
                vv.setMediaController(Mc);
                vv.setVideoURI(uri);
                vv.requestFocus();
                vv.start();
            }
        });

        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "A toast is made", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert=new AlertDialog.Builder(context);
                alert.setTitle("AlertBox");
                alert.setMessage("Do u want to close").setPositiveButton("yes", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {
                        MainActivity2.this.finish();
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i)
                    {

                    }
                });
                AlertDialog obj=alert.create();
                obj.show();
            }
        });

    }
}
