package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;

public class OpenMustaqil extends AppCompatActivity {
    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_mustaqil);

        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pdfView.fromAsset("MustaqilIshlar/mustaqil.pdf").load();
    }
}



