package com.example.thiti.ict_88510159;


import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class lesson8 extends AppCompatActivity {

    private int[] imageUrls = new int[]{
            R.drawable.lesson8on1,
            R.drawable.lesson8on2,
            R.drawable.lesson8on3,
            R.drawable.lesson8on4,
            R.drawable.lesson8on5,
            R.drawable.lesson8on6,
            R.drawable.lesson8on7,
            R.drawable.lesson8on8,
            R.drawable.lesson8on9,
            R.drawable.lesson8on10,
            R.drawable.lesson8on11,
            R.drawable.lesson8on12,
            R.drawable.lesson8on13,
            R.drawable.lesson8on14,
            R.drawable.lesson8on15,
            R.drawable.lesson8on16,
            R.drawable.lesson8on17,
            R.drawable.lesson8on18,
            R.drawable.lesson8on19,
            R.drawable.lesson8on20,
            R.drawable.lesson8on21,
            R.drawable.lesson8on22,
            R.drawable.lesson8on23


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