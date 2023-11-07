package com.najo.maruza;

import static com.najo.maruza.R.id.a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class OquvMeyoriyHujjatlar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oquv_meyoriy_hujjatlar);

        RelativeLayout uquv = findViewById(R.id.a1);
        RelativeLayout ishchi = findViewById(R.id.a2);


        uquv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OquvMeyoriyHujjatlar.this, NamunaviyDastur.class);
                startActivity(intent);
            }
        });

    }
}