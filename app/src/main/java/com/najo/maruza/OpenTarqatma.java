package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;

public class OpenTarqatma extends AppCompatActivity {
    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_tarqatma);


        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");
//        Log.e("TAG", "onCreate: "+tag );
        binding.pdfView.fromAsset("Tarqatma/"+tag+".pdf").load();
    }
}