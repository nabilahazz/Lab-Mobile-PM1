package com.example.pekan5;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.ViewHolder> {

    private ArrayList<Tweet> tweets;

    public SearchAdapter(ArrayList<Tweet> tweets) {
        this.tweets = tweets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search, parent, false);
        return new SearchAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Tweet tweet = tweets.get(position);

        holder.IV_Search.setImageResource(tweet.getProfilePhoto());
        holder.tv_username.setText(tweet.getUsername());
        holder.tv_name.setText(tweet.getName());

        holder.search_layout.setOnClickListener(v -> {
            Intent intent = new Intent(holder.context, ProfileActivity.class);
            intent.putExtra("tweet", tweet);
            holder.context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return tweets.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView IV_Search;
        TextView tv_username, tv_name;
        LinearLayout search_layout;
        Context context;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            IV_Search = itemView.findViewById(R.id.iv_profilrSearch);
            tv_username = itemView.findViewById(R.id.tv_username);
            tv_name = itemView.findViewById(R.id.tv_name);
            context = itemView.getContext();
            search_layout = itemView.findViewById(R.id.search_layout);
        }
    }
}
