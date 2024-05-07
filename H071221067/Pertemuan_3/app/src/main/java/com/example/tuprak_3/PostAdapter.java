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

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder> {
    private final ArrayList<Post> posts;
    private ClickListenerPost clickAvatar;

    public PostAdapter(ArrayList<Post> posts) {
        this.posts = posts;
    }

    public void setClickPost (ClickListenerPost clickAvatar) {
        this.clickAvatar = clickAvatar;

    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.setData(post);

        holder.tv_username.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProfileActivity.class);
                intent.putExtra("username", post.getUsername());
                intent.putExtra("postingan", post.getImage_post());
                v.getContext().startActivity(intent);
            }
        });

        holder.iv_avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickAvatar != null) {
                    clickAvatar.onAvatarClicked(post);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_avatar;
        private final TextView tv_username;
        private final ImageView iv_post;
        private final TextView tv_likes;
        private final TextView tv_deskripsi;
        private final TextView tv_time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_avatar = itemView.findViewById(R.id.post_avatar);
            tv_username = itemView.findViewById(R.id.post_username);
            iv_post = itemView.findViewById(R.id.post_image);
            tv_likes = itemView.findViewById(R.id.post_likes);
            tv_deskripsi = itemView.findViewById(R.id.post_caption);
            tv_time = itemView.findViewById(R.id.post_time);
        }

        public void setData(Post post) {
            iv_avatar.setImageResource(post.getAvatar());
            tv_username.setText(post.getUsername());
            iv_post.setImageResource(post.getImage_post());
            tv_likes.setText(post.getLike_count());
            tv_deskripsi.setText(post.getDescription());
            tv_time.setText(post.getTime());
        }
    }

    interface ClickListenerPost {
        void onAvatarClicked(Post post);
    }
}
