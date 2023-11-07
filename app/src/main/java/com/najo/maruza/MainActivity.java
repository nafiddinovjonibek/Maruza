package com.najo.maruza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.menu);
        RelativeLayout uquv = findViewById(R.id.task1);
//        RelativeLayout ishchi = findViewById(R.id.task2);
        RelativeLayout maruza = findViewById(R.id.task3);
        RelativeLayout amaliy = findViewById(R.id.task4);
        RelativeLayout nazorat = findViewById(R.id.task5);
        RelativeLayout tarqatma = findViewById(R.id.task6);
        RelativeLayout glossary = findViewById(R.id.task7);
        RelativeLayout mustaqil = findViewById(R.id.task8);
        RelativeLayout test = findViewById(R.id.task9);
        RelativeLayout adabiyot = findViewById(R.id.task10);
        RelativeLayout video = findViewById(R.id.task11);
        RelativeLayout muallif = findViewById(R.id.task12);


        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Initializing the popup menu and giving the reference as current context
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, imageView);

                // Inflating popup menu from popup_menu.xml file
                popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        String title = menuItem.getTitle().toString();



                        if ("Dastur haqida".equals(title)) {
                            Log.d("menu item", "2-si: ");
                            Intent intent = new Intent(MainActivity.this, About.class);
                            startActivity(intent);
                        }

                        return true;
                    }
                });
                // Showing the popup menu
                popupMenu.show();

            }
        });



        uquv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NamunaviyDastur.class);
                startActivity(intent);
            }
        });

        maruza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MaruzaMashguloti.class);
                startActivity(intent);
            }
        });

        amaliy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Amaliy.class);
                startActivity(intent);
            }
        });


        nazorat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Nazorat.class);
                startActivity(intent);
            }
        });

        tarqatma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Tarqatma.class);
                startActivity(intent);
            }
        });

        glossary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OpenGlossary.class);
                startActivity(intent);
            }
        });

        mustaqil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OpenMustaqil.class);
                startActivity(intent);
            }
        });

        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OpenTest.class);
                startActivity(intent);
            }
        });

        adabiyot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Adabiyot.class);
                startActivity(intent);
            }
        });


        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, video_menu.class);
                startActivity(intent);
            }
        });

        muallif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Zokirov.class);
                startActivity(intent);
            }
        });


    }



}