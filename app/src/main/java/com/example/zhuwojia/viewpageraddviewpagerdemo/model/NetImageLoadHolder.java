package com.example.zhuwojia.viewpageraddviewpagerdemo.model;

import android.content.Context;
import android.widget.ImageView;

import com.bigkoo.convenientbanner.holder.Holder;
import com.bumptech.glide.Glide;
import com.example.zhuwojia.viewpageraddviewpagerdemo.R;

/**
 * Created by zhuwojia on 2016/12/7.
 */

public class NetImageLoadHolder implements Holder<String> {
    private ImageView image_lv;

    //可以是一个布局也可以是一个Imageview
    @Override
    public ImageView createView(Context context) {
        image_lv = new ImageView(context);
        image_lv.setScaleType(ImageView.ScaleType.FIT_XY);
        return image_lv;

    }

    @Override
    public void UpdateUI(Context context, int position, String data) {

        Glide.with(context).load(data).placeholder(R.mipmap.ic_launcher).into(image_lv);
    }
}
