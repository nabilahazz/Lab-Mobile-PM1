package com.example.tuprak_3;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class InstaStoryAdapter extends RecyclerView.Adapter<InstaStoryAdapter.ViewHolderStory> {

    private final ArrayList<InstaStory> instaStories;
    private ClickListenerStory clickStory;

    public InstaStoryAdapter(ArrayList<InstaStory> instaStories) {
        this.instaStories = instaStories;
    }

    public void setClickStory(ClickListenerStory clickStory) {
        this.clickStory = clickStory;
    }

    @NonNull
    @Override
    public InstaStoryAdapter.ViewHolderStory onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.instastory_icon, parent, false);
        return new ViewHolderStory(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InstaStoryAdapter.ViewHolderStory holder, int position) {
        InstaStory instaStory = instaStories.get(position);
        holder.setDataStory(instaStory);

        String username = instaStory.getStory_username();
        if (username.length() > 10) {
            username = username.substring(0, 10) + "...";
        }

        holder.tv_storyUsername.setText(username);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clickStory != null) {
                    clickStory.onItemClicked(instaStory);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return instaStories.size();
    }

    public class ViewHolderStory extends RecyclerView.ViewHolder {
        private final ImageView iv_storyAvatar;
        private final TextView tv_storyUsername;

        public ViewHolderStory(@NonNull View itemView) {
            super(itemView);
            iv_storyAvatar = itemView.findViewById(R.id.story_image);
            tv_storyUsername = itemView.findViewById(R.id.story_username);
        }

        public void setDataStory(InstaStory instaStory) {
            iv_storyAvatar.setImageResource(instaStory.getStory_avatar());
        }
    }

    interface ClickListenerStory {
        void onItemClicked(InstaStory instaStory);
    }
}
