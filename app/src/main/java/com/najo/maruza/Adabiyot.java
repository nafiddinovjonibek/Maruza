package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;

public class Adabiyot extends AppCompatActivity {

    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adabiyot);


        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pdfView.fromAsset("Adabiyot/adabiyot.pdf").load();
    }
}