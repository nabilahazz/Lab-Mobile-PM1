package com.example.pekan5.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pekan5.DataSource;
import com.example.pekan5.PostinganAdapter;
import com.example.pekan5.R;
import com.example.pekan5.Tweet;

public class HomeFragment extends Fragment {

    public static final String EXTRA_TWEET = "extra_tweet";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView rvPostingan = view.findViewById(R.id.rv_post);
        rvPostingan.setHasFixedSize(true);
        PostinganAdapter postinganAdapter = new PostinganAdapter(DataSource.tweets);
        rvPostingan.setAdapter(postinganAdapter);

        Bundle bundle = getArguments();
        if (bundle != null) {
            Tweet tweet = bundle.getParcelable(EXTRA_TWEET);
            if (tweet != null) {
                DataSource.tweets.add(0, tweet);
                postinganAdapter.notifyDataSetChanged();
            }
        }

    }
}
