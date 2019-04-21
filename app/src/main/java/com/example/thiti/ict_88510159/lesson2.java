package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;




public class lesson2 extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter2 sliderAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager2);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout2);

        sliderAdapter2 = new SliderAdapter2(this);
        mSlideViewPager.setAdapter(sliderAdapter2);





    }
}
