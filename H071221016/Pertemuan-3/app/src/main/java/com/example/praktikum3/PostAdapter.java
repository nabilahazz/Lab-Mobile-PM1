package com.example.praktikum3;

import android.content.Context;
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
    private Context context;

    public PostAdapter(ArrayList<Post> posts, Context context) {
        this.posts = posts;
        this.context = context;
    }

    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        Post post = posts.get(position);
        holder.setData(post);

        holder.username.setOnClickListener(v -> {
            if(posts.get(position).getUsername().equals("Math")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.math);
                profileIntent.putExtra("User Name","Math");
                profileIntent.putExtra("Followers","1,5 JT");
                profileIntent.putExtra("Following","5");
                profileIntent.putExtra("Postingan", R.drawable.math);
                context.startActivity(profileIntent);
            }  if(posts.get(position).getUsername().equals("Art")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.art);
                profileIntent.putExtra("User Name","Art");
                profileIntent.putExtra("Followers","13,5 JT");
                profileIntent.putExtra("Following","6.452");
                profileIntent.putExtra("Postingan", R.drawable.art);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Science")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.science);
                profileIntent.putExtra("User Name","Science");
                profileIntent.putExtra("Followers","1,3 JT");
                profileIntent.putExtra("Following","172");
                profileIntent.putExtra("Postingan", R.drawable.science);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Sport")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.sport);
                profileIntent.putExtra("User Name","Sport");
                profileIntent.putExtra("Followers","6,9 JT");
                profileIntent.putExtra("Following","1");
                profileIntent.putExtra("Postingan", R.drawable.sport);
                context.startActivity(profileIntent);
            }if(posts.get(position).getUsername().equals("English")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.english);
                profileIntent.putExtra("User Name","English");
                profileIntent.putExtra("Followers","9,9 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.english);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Eduction")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.education);
                profileIntent.putExtra("User Name","Education");
                profileIntent.putExtra("Followers","17,6 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.education);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Geography")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.geography);
                profileIntent.putExtra("User Name","Geography");
                profileIntent.putExtra("Followers","8,6 JT");
                profileIntent.putExtra("Following","4");
                profileIntent.putExtra("Postingan", R.drawable.geography);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("History")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.history);
                profileIntent.putExtra("User Name","History");
                profileIntent.putExtra("Followers","3,4 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.history);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Jerman")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.jerman);
                profileIntent.putExtra("User Name","Germany");
                profileIntent.putExtra("Followers","5,4 JT");
                profileIntent.putExtra("Following","3");
                profileIntent.putExtra("Postingan", R.drawable.jerman);
                context.startActivity(profileIntent);
            } if(posts.get(position).getUsername().equals("Tech")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.tech);
                profileIntent.putExtra("User Name","tech");
                profileIntent.putExtra("Followers","2,4 JT");
                profileIntent.putExtra("Following","1");
                profileIntent.putExtra("Postingan", R.drawable.tech);
                context.startActivity(profileIntent);
            }
        });
        holder.imgStory.setOnClickListener(v -> {
            if(posts.get(position).getImgpost().equals(R.drawable.math)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.math);
                storyIntent.putExtra("User Name", "Math");
                storyIntent.putExtra("Story", R.drawable.math);
                context.startActivity(storyIntent);
            } if(posts.get(position).getImgpost().equals(R.drawable.art)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.art);
                storyIntent.putExtra("User Name", "Art");
                storyIntent.putExtra("Story", R.drawable.art);
                context.startActivity(storyIntent);
            } if(posts.get(position).getImgpost().equals(R.drawable.science)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.science);
                storyIntent.putExtra("User Name", "Science");
                storyIntent.putExtra("Story", R.drawable.science);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.sport)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.sport);
                storyIntent.putExtra("User Name", "Sport");
                storyIntent.putExtra("Story", R.drawable.sport);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.english)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.english);
                storyIntent.putExtra("User Name", "English");
                storyIntent.putExtra("Story", R.drawable.english);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.education)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.education);
                storyIntent.putExtra("User Name", "Education");
                storyIntent.putExtra("Story", R.drawable.education);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.geography)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.geography);
                storyIntent.putExtra("User Name", "Geography");
                storyIntent.putExtra("Story", R.drawable.geography);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.history)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.history);
                storyIntent.putExtra("User Name", "History");
                storyIntent.putExtra("Story", R.drawable.history);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.jerman)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.jerman);
                storyIntent.putExtra("User Name", "Germany");
                storyIntent.putExtra("Story", R.drawable.jerman);
                context.startActivity(storyIntent);
            }if(posts.get(position).getImgpost().equals(R.drawable.tech)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.tech);
                storyIntent.putExtra("User Name", "Tech");
                storyIntent.putExtra("Story", R.drawable.tech);
                context.startActivity(storyIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView imgPost;
        private final ImageView imgStory;
        private final TextView username;
        private final TextView caption;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPost= itemView.findViewById(R.id.post);
            imgStory = itemView.findViewById(R.id.profil);
            username = itemView.findViewById(R.id.uname);
            caption = itemView.findViewById(R.id.capt);
        }

        public void setData(Post post) {
            imgPost.setImageResource(post.getImgpost());
            imgStory.setImageResource(post.getImgprofil());
            username.setText(post.getUsername());
            caption.setText(post.getCaption());
        }
    }
}
