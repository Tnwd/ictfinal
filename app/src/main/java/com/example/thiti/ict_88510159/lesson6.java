package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson6 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson6con1,
            R.drawable.lesson6con2,
            R.drawable.lesson6con3,
            R.drawable.lesson6con4,
            R.drawable.lesson6con5,
            R.drawable.lesson6con6,
            R.drawable.lesson6con7,
            R.drawable.lesson6con8,
            R.drawable.lesson6con9,
            R.drawable.lesson6con10,
            R.drawable.lesson6con11,
            R.drawable.lesson6con12,
            R.drawable.lesson6con13,
            R.drawable.lesson6con14,
            R.drawable.lesson6con15,
            R.drawable.lesson6con16,
            R.drawable.lesson6con17,
            R.drawable.lesson6con18,
            R.drawable.lesson6con19,
            R.drawable.lesson6con20,
            R.drawable.lesson6con21,
            R.drawable.lesson6con22,
            R.drawable.lesson6con23,
            R.drawable.lesson6con24

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        ViewPager viewPager = findViewById(R.id.view_pager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(this,imageUrls);
        viewPager.setAdapter(adapter);





    }
}