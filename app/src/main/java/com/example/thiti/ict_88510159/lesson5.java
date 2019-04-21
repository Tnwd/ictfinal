package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;


public class lesson5 extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter5 sliderAdapter5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson5);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager5);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout5);

        sliderAdapter5 = new SliderAdapter5(this);
        mSlideViewPager.setAdapter(sliderAdapter5);





    }
}

