package com.narara.android_movie_test;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager_movie);
        MovieViewPagerAdapter adapter = new MovieViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);


    }
}
