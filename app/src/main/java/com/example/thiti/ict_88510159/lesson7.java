package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson7 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson7www1,
            R.drawable.lesson7www2,
            R.drawable.lesson7www3,
            R.drawable.lesson7www4,
            R.drawable.lesson7www5,
            R.drawable.lesson7www6,
            R.drawable.lesson7www7,
            R.drawable.lesson7www8,
            R.drawable.lesson7www9,
            R.drawable.lesson7www10,
            R.drawable.lesson7www11,
            R.drawable.lesson7www12,
            R.drawable.lesson7www13

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