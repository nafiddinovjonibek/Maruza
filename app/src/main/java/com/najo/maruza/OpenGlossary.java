package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;

public class OpenGlossary extends AppCompatActivity {

    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_glossary);

        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pdfView.fromAsset("Glossariy/Glossariy.pdf").load();
    }
}