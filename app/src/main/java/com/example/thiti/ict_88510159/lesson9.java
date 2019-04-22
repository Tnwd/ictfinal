package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson9 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson9ecom1,
            R.drawable.lesson9ecom2,
            R.drawable.lesson9ecom3,
            R.drawable.lesson9ecom4,
            R.drawable.lesson9ecom5,
            R.drawable.lesson9ecom6,
            R.drawable.lesson9ecom7,
            R.drawable.lesson9ecom8,
            R.drawable.lesson9ecom9,
            R.drawable.lesson9ecom10,
            R.drawable.lesson9ecom11,
            R.drawable.lesson9ecom12,
            R.drawable.lesson9ecom13,
            R.drawable.lesson9ecom14,
            R.drawable.lesson9ecom15,
            R.drawable.lesson9ecom16,
            R.drawable.lesson9ecom17,
            R.drawable.lesson9ecom18,
            R.drawable.lesson9ecom19,
            R.drawable.lesson9ecom20,
            R.drawable.lesson9ecom21,
            R.drawable.lesson9ecom22,
            R.drawable.lesson9ecom23,
            R.drawable.lesson9ecom24,
            R.drawable.lesson9ecom25,
            R.drawable.lesson9ecom26,
            R.drawable.lesson9ecom27,
            R.drawable.lesson9ecom28,
            R.drawable.lesson9ecom29,
            R.drawable.lesson9ecom30,
            R.drawable.lesson9ecom31,
            R.drawable.lesson9ecom32,

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