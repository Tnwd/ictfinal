package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson11 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson5muti1,
            R.drawable.lesson5muti2,
            R.drawable.lesson5muti3,
            R.drawable.lesson5muti4,
            R.drawable.lesson5muti5,
            R.drawable.lesson5muti6,
            R.drawable.lesson5muti7,
            R.drawable.lesson5muti8,
            R.drawable.lesson5muti9,
            R.drawable.lesson5muti10,
            R.drawable.lesson5muti11,
            R.drawable.lesson5muti12,
            R.drawable.lesson5muti13,
            R.drawable.lesson5muti14,
            R.drawable.lesson5muti15,
            R.drawable.lesson5muti16,
            R.drawable.lesson5muti17,
            R.drawable.lesson5muti18,
            R.drawable.lesson5muti19,
            R.drawable.lesson5muti20,
            R.drawable.lesson5muti21,
            R.drawable.lesson5muti22,
            R.drawable.lesson5muti23,
            R.drawable.lesson5muti24

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