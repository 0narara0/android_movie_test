package com.narara.android_movie_test;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MovieFragment.OnDetailsClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.view_pager_movie);
        MovieViewPagerAdapter adapter = new MovieViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

    }

    @Override
    public void onClick(MovieInfo movieInfo, View view, int position) {
        Toast.makeText(this, "제목: " + movieInfo.titles[position] + "\n내용: "
                + movieInfo.contents[position], Toast.LENGTH_SHORT).show();
    }
}
