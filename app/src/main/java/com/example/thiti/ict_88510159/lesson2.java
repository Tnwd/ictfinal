package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson2 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson2_1,
            R.drawable.lesson2_2,
            R.drawable.lesson2_3,
            R.drawable.lesson2_4,
            R.drawable.lesson2_5

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