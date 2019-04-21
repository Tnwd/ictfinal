package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;




public class lesson4 extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter4 sliderAdapter4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson4);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager4);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout2);

        sliderAdapter4 = new SliderAdapter4(this);
        mSlideViewPager.setAdapter(sliderAdapter4);





    }
}
