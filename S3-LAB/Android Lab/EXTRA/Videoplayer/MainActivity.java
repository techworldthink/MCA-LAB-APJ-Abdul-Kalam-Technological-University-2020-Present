package com.example.wsday2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vv;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vv=(VideoView) findViewById(R.id.vv_id);

        MediaController mc=new MediaController(this);


                //set mediacontroller to enable play,pause,forward,etc options

                mc.setAnchorView(vv);
                //Location of media file
                Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.vbn);
                vv.setMediaController(mc);
                vv.setVideoURI(uri);
                vv.requestFocus();
                vv.start();


    }
}
