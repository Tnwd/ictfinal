package com.example.thiti.ict_88510159;


        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.LinearLayout;




public class lesson3 extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    private LinearLayout mDotLayout;
    private SliderAdapter3 sliderAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson3);

        mSlideViewPager = (ViewPager) findViewById(R.id.slideViewPager3);
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout2);

        sliderAdapter3 = new SliderAdapter3(this);
        mSlideViewPager.setAdapter(sliderAdapter3);





    }
}
