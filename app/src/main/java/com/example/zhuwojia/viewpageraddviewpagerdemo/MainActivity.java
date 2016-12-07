package com.example.zhuwojia.viewpageraddviewpagerdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.zhuwojia.viewpageraddviewpagerdemo.fragment.BaseFragment;
import com.example.zhuwojia.viewpageraddviewpagerdemo.model.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private List<Fragment> list = new ArrayList<Fragment>();
    private String[] titles = new String[]{"精彩","特卖","优选","新品","海景","主题","特色","热卖","设计","高端","客栈","湖景","温泉","滑雪","买楼收租"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        list = getFragment();
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),list,titles));

    }


    public List<Fragment> getFragment(){
        List<Fragment> list = new ArrayList<>();
        for (int i = 0; i < titles.length; i++) {
            BaseFragment fragment = new BaseFragment();
            list.add(fragment);
        }
        return list;
    }
}

