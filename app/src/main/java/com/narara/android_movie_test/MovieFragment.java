package com.narara.android_movie_test;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnDetailsClickListener} interface
 * to handle interaction events.
 * Use the {@link MovieFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MovieFragment extends Fragment {
    Button mDetailsbutton;
    private static final String ARG_RES = "resource";
    private static final String ARG_TITLE = "title";

    private MovieInfo movieInfo;

    // TODO: Rename and change types of parameters
    private int mRes;
    private String mTitle;

    private OnDetailsClickListener mListener;

    public MovieFragment() {
        // Required empty public constructor
    }

    public static MovieFragment newInstance(int res, String title) {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_RES, res);
        args.putString(ARG_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mRes = getArguments().getInt(ARG_RES);
            mTitle = getArguments().getString(ARG_TITLE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        ImageView imageView = view.findViewById(R.id.image_view_movie);
        imageView.setBackgroundResource(mRes);
        TextView textView = view.findViewById(R.id.text_view_movie_title);
        textView.setText(mTitle);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDetailsbutton = view.findViewById(R.id.button_details);
        mDetailsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mListener != null) {
                    mListener.onClick(movieInfo);
                }
            }
        });

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnDetailsClickListener) {
            mListener = (OnDetailsClickListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnDetailsClickListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnDetailsClickListener {
        void onClick(MovieInfo movieInfo);
    }
}
