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
        mData.add(MovieFragment.newInstance(R.drawable.movie_image_ggun, "꾼"));
        mData.add(MovieFragment.newInstance(R.drawable.movie_image_final_score, "파이널 스코어"));
        mData.add(MovieFragment.newInstance(R.drawable.movie_image_first_man, "퍼스트 맨"));
        mData.add(MovieFragment.newInstance(R.drawable.movie_image_interstellar, "인터스텔라"));
        mData.add(MovieFragment.newInstance(R.drawable.movie_image_inception, "인셉션"));

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
