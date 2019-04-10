package com.narara.android_movie_test;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class MovieViewPagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mData;

    public MovieViewPagerAdapter(FragmentManager fm) {
        super(fm);
        mData = new ArrayList<>();
        mData.add(MovieFragment.newInstance());
        mData.add(MovieFragment.newInstance());
        mData.add(MovieFragment.newInstance());
        mData.add(MovieFragment.newInstance());
        mData.add(MovieFragment.newInstance());

    }

    @Override
    public Fragment getItem(int i) {
        return mData.get(i);
    }

    @Override
    public int getCount() {
        return mData.size();
    }
}
