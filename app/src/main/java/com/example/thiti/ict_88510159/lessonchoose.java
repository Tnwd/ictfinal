package com.example.thiti.ict_88510159;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class lessonchoose extends AppCompatActivity {

    ImageButton lessonpoum1;
    ImageButton lessonpoum2;
    ImageButton lessonpoum3;
    ImageButton lessonpoum4;
    ImageButton lessonpoum5;
    ImageButton lessonpoum6;
    ImageButton lessonpoum7;
    ImageButton lessonpoum8;
    ImageButton lessonpoum9;
    ImageButton lessonpoum10;
    ImageButton lessonpoum11;
    ImageButton homepoum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessonchoose);
        lessonpoum1=(ImageButton) findViewById(R.id.lessonpoum1);
        lessonpoum2=(ImageButton) findViewById(R.id.lessonpoum2);
        lessonpoum3=(ImageButton) findViewById(R.id.lessonpoum3);
        lessonpoum4=(ImageButton) findViewById(R.id.lessonpoum4);
        lessonpoum5=(ImageButton) findViewById(R.id.lessonpoum5);
        lessonpoum6=(ImageButton) findViewById(R.id.lessonpoum6);
        lessonpoum7=(ImageButton) findViewById(R.id.lessonpoum7);
        lessonpoum8=(ImageButton) findViewById(R.id.lessonpoum8);
        lessonpoum9=(ImageButton) findViewById(R.id.lessonpoum9);
        lessonpoum10=(ImageButton) findViewById(R.id.lessonpoum10);
        lessonpoum11=(ImageButton) findViewById(R.id.lessonpoum11);
        homepoum=(ImageButton) findViewById(R.id.homepoum);

        lessonpoum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson1.class);
                startActivity(lessonbuttom);
            }
        });

        lessonpoum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson2.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson3.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson4.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson5.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson6.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson7.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson8.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson9.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson10.class);
                startActivity(lessonbuttom);
            }
        });
        lessonpoum11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, lesson11.class);
                startActivity(lessonbuttom);
            }
        });

        homepoum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(lessonchoose.this, MainActivity.class);
                startActivity(lessonbuttom);
            }
        });



            }
}



