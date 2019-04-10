package com.narara.android_movie_test;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class MovieGridFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private MovieRecyclerAdapter mAdapter;
    private List<Movie> mList = new ArrayList<>();


    public MovieGridFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mList.add(new Movie(R.drawable.movie_image_ggun, "꾼"));
        mList.add(new Movie(R.drawable.movie_image_final_score, "Final Score"));
        mList.add(new Movie(R.drawable.movie_image_first_man, "First Man"));
        mList.add(new Movie(R.drawable.movie_image_interstellar, "Interstellar"));
        mList.add(new Movie(R.drawable.movie_image_inception, "Inception"));
        return inflater.inflate(R.layout.fragment_movie_grid, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRecyclerView = view.findViewById(R.id.recycler_view);
        mAdapter = new MovieRecyclerAdapter();
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setItems(mList);
        mAdapter.notifyDataSetChanged();
    }


}
