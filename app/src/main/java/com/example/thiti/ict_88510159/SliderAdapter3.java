package com.example.thiti.ict_88510159;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SliderAdapter3 extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter3(Context context){
        this.context = context;

    }

    //array
    public int[] slide_images = {
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
    public int getCount() {
        return slide_images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){

        layoutInflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);

        slideImageView.setImageResource(slide_images[position]);
        container.addView(view );
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container,int position,Object object){

        container.removeView((RelativeLayout)object);
    }
}


