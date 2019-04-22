package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson1 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson1ar,
            R.drawable.lesson1ecom,
            R.drawable.lesson1gps,
            R.drawable.lesson1gps2,
            R.drawable.lesson1smartponelose,
            R.drawable.lesson1tv,
            R.drawable.lesson1wearable

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