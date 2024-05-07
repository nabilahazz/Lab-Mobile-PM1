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
import java.util.zip.Inflater;

public class ProfileAdapter extends RecyclerView.Adapter<ProfileAdapter.ViewHolderProfile> {
    private final ArrayList<Profile> profiles;

    public ProfileAdapter(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public ProfileAdapter.ViewHolderProfile onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.postingan, parent, false);
        return new ViewHolderProfile(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProfileAdapter.ViewHolderProfile holder, int position) {
        Profile profile = profiles.get(position);
        holder.setDataProfile(profile);

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    public class ViewHolderProfile extends RecyclerView.ViewHolder {
        private final TextView tv_profileUsername;
        private final ImageView iv_profileAvatar;
        private final TextView tv_profileFollowers;
        private final TextView tv_profileFollowing;
        private final TextView tv_profileBio;
        private final ImageView iv_profilePosts;

        public ViewHolderProfile(@NonNull View itemView) {
            super(itemView);
            tv_profileUsername = itemView.findViewById(R.id.profile_username);
            iv_profileAvatar = itemView.findViewById(R.id.profile_image);
            tv_profileFollowers = itemView.findViewById(R.id.text_followers);
            tv_profileFollowing = itemView.findViewById(R.id.text_following);
            tv_profileBio = itemView.findViewById(R.id.profile_bio);
            iv_profilePosts = itemView.findViewById(R.id.rv_postingan);
        }

        public void setDataProfile(Profile profile) {
            tv_profileUsername.setText(profile.getProfile_username());
            iv_profileAvatar.setImageResource(profile.getProfile_avatar());
            tv_profileFollowers.setText(profile.getProfile_followers());
            tv_profileFollowing.setText(profile.getProfile_following());
            tv_profileBio.setText(profile.getProfile_bio());
            iv_profilePosts.setImageResource(profile.getProfile_post());
        }
    }
}