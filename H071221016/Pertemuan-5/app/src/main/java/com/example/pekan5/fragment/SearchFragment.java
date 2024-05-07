package com.example.pekan5.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pekan5.DataSource;
import com.example.pekan5.R;
import com.example.pekan5.SearchAdapter;
import com.example.pekan5.Tweet;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SearchFragment extends Fragment {

    private ArrayList<Tweet> tweetArrayList;
    private RecyclerView recyclerView;
    private SearchAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        SearchView searchView = view.findViewById(R.id.search);
        ProgressBar progressBar = view.findViewById(R.id.progressBar);

        recyclerView = view.findViewById(R.id.recylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        tweetArrayList = new ArrayList<>();

        adapter = new SearchAdapter(tweetArrayList);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener(){
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                progressBar.setVisibility(View.VISIBLE);
                recyclerView.setVisibility(View.GONE);

                ExecutorService executor = Executors.newSingleThreadExecutor();
                Handler handler = new Handler(Looper.getMainLooper());
                executor.execute(() -> {
                    ArrayList<Tweet> filteredList = new ArrayList<>();
                    if (!newText.isEmpty()) {
                        for (Tweet item : DataSource.tweets) {
                            if (item.getUsername().toLowerCase().contains(newText.toLowerCase()) ||
                                    item.getName().toLowerCase().contains(newText.toLowerCase())) {
                                filteredList.add(item);
                            }
                        }
                    }
                    try {
                        Thread.sleep(1000);
                        handler.post(() -> {
                            progressBar.setVisibility(View.GONE);
                            recyclerView.setVisibility(View.VISIBLE);
                            tweetArrayList.clear();
                            if (!newText.isEmpty()) {
                                tweetArrayList.addAll(filteredList);
                            }
                            adapter.notifyDataSetChanged();
                        });
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                });
                return true;
            }
        });

    }
}
