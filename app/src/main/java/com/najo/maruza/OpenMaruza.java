package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.github.barteksc.pdfviewer.PDFView;
import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;
public class OpenMaruza extends AppCompatActivity {

    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_maruza);

        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");
//        Log.e("TAG", "onCreate: "+tag );
        binding.pdfView.fromAsset("Maruza/"+tag+".pdf").load();


    }
}