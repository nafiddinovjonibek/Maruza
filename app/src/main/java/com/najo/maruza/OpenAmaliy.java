package com.najo.maruza;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.najo.maruza.databinding.ActivityNamunaviyDasturBinding;

public class OpenAmaliy extends AppCompatActivity {
    ActivityNamunaviyDasturBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_amaliy);

        binding = ActivityNamunaviyDasturBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Intent intent = getIntent();
        String tag = intent.getStringExtra("tag");
//        Log.e("TAG", "onCreate: "+tag );
        binding.pdfView.fromAsset("Amaliy/"+tag+".pdf").load();
    }
}