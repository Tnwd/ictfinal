package com.example.thiti.ict_88510159;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class SliderAdapter4 extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter4(Context context){
        this.context = context;

    }

    //array
    public int[] slide_images = {
            R.drawable.lesson1ar,
            R.drawable.lesson1ecom,
            R.drawable.lesson1gps,
            R.drawable.lesson1gps2,
            R.drawable.lesson1smartponelose,
            R.drawable.lesson1tv,
            R.drawable.lesson1wearable


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


