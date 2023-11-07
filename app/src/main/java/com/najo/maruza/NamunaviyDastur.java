package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;


public class NamunaviyDastur extends AppCompatActivity {

    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pdfView.fromAsset("namunaviy.pdf").load();


    }
}