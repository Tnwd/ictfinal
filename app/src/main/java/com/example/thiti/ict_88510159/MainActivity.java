package com.example.thiti.ict_88510159;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton lessonbutton;
    ImageButton quizbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lessonbutton=(ImageButton) findViewById(R.id.lessonbutton);
        quizbutton =(ImageButton) findViewById(R.id.quizbutton);

        lessonbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lessonbuttom = new Intent(MainActivity.this, lessonchoose.class);
                startActivity(lessonbuttom);
            }
        });
        quizbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizonbuttom=new Intent(MainActivity.this,StartingScreenActivity.class);
                startActivity(quizonbuttom);
            }


        });

    }
}
