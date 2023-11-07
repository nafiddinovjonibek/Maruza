package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Video extends AppCompatActivity {

    private VideoView videoView1;
    private MediaController mediaController;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView1 = findViewById(R.id.video1);


        // Videoni joylashuvi

        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");
        String videoPath;
        switch(tag) {
            case "1":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v1;
                break;
            case "2":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v2;
                break;
            case "3":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v3;
                break;
            case "4":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v4;
                break;
            case "5":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v5;
                break;
            case "6":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v6;
                break;
            case "7":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v7;
                break;
            case "8":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v8;
                break;
            case "9":
                videoPath = "android.resource://" + getPackageName() + "/" + R.raw.v9;
                break;
            default:
                videoPath = "xato";
                break;
        }


        Uri uri = Uri.parse(videoPath);
        videoView1.setVideoURI(uri);



        // creating object of
        // media controller class
        mediaController = new MediaController(this);

        // sets the anchor view
        // anchor view for the videoView

        mediaController.setAnchorView(videoView1);


        // sets the media player to the videoView

        mediaController.setMediaPlayer(videoView1);


        // sets the media controller to the videoView
        videoView1.setMediaController(mediaController);



        // Videoni boshlash
        videoView1.start();


    }

//    @Override
//    public void onBackPressed() {
//
//        if (mediaController != null) {
//            mediaController.hide();
//            super.onBackPressed();
//        }
//
//    }



}