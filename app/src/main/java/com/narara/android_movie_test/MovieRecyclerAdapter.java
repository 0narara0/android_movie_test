package com.narara.android_movie_test;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MovieRecyclerAdapter extends RecyclerView.Adapter<MovieRecyclerAdapter.MovieViewHolder> {
    List<Movie> mItems = new ArrayList<>();

    public void setItems(List<Movie> items) {
        mItems = items;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_movie, viewGroup, false);
        MovieViewHolder movieViewHolder = new MovieViewHolder(view);
        return movieViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder movieViewHolder, int position) {
        Movie movie = mItems.get(position);
        movieViewHolder.linearLayout.setBackgroundResource(movie.getImageRes());
        movieViewHolder.titleTextView.setText(movie.getTitle());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        public LinearLayout linearLayout;
        public TextView titleTextView;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);

            linearLayout = itemView.findViewById(R.id.linear_layout);
            titleTextView = itemView.findViewById(R.id.text_view_grid_title);
        }
    }
}
