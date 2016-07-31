package com.example.kjhoo.sunrinton2016re;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by kjhoo on 2016-07-22.
 */
public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> mFragments = new ArrayList<>();

    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    public void addFragment(Fragment fragment)
    {
        mFragments.add(fragment);
    }

    @Override
    public Fragment getItem(int position)
    {
        return mFragments.get(position);
    }

    @Override
    public int getCount()
    {
        return mFragments.size();
    }


}