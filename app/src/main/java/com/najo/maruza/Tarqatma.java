package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Tarqatma extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarqatma);



    }

    public void Open(View v) {
        // does something very interesting
//        String id = v.getTag().toString();
        Intent open = new Intent(Tarqatma.this, OpenTarqatma.class);
        open.putExtra("tag",v.getTag().toString());
        Log.e("tag", "Open: "+v.getTag().toString() );
        startActivity(open);
    }
}