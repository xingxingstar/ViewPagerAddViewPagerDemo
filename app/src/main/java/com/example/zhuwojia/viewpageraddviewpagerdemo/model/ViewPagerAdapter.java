package com.example.zhuwojia.viewpageraddviewpagerdemo.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import java.util.List;

/**
 * Created by zhuwojia on 2016/12/6.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> list;
    private String[] titles;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> list, String[] titles) {
        super(fm);
        this.list = list;
        this.titles = titles;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        Log.e("TAG", "getCount: " + titles.length);
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
