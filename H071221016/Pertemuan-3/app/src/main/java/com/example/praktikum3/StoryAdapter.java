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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder> {

    private final ArrayList<Story> stories;

    public StoryAdapter(ArrayList<Story> stories, Context context) {
        this.stories = stories;
        this.context = context;
    }

    private Context context;


    @NonNull
    @Override
    public StoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_story, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StoryAdapter.ViewHolder holder, int position) {
        Story story = stories.get(position);
        holder.setData(story);

        holder.textView.setOnClickListener(v -> {
            if(stories.get(position).getUsername().equals("Math")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.math);
                profileIntent.putExtra("User Name","Math");
                profileIntent.putExtra("Followers","1,5 JT");
                profileIntent.putExtra("Following","5");
                profileIntent.putExtra("Postingan", R.drawable.math);
                context.startActivity(profileIntent);
            }  if(stories.get(position).getUsername().equals("Art")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.art);
                profileIntent.putExtra("User Name","Art");
                profileIntent.putExtra("Followers","13,5 JT");
                profileIntent.putExtra("Following","6.452");
                profileIntent.putExtra("Postingan", R.drawable.art);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Science")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.science);
                profileIntent.putExtra("User Name","Science");
                profileIntent.putExtra("Followers","1,3 JT");
                profileIntent.putExtra("Following","172");
                profileIntent.putExtra("Postingan", R.drawable.science);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Sport")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.sport);
                profileIntent.putExtra("User Name","Sport");
                profileIntent.putExtra("Followers","6,9 JT");
                profileIntent.putExtra("Following","1");
                profileIntent.putExtra("Postingan", R.drawable.sport);
                context.startActivity(profileIntent);
            }if(stories.get(position).getUsername().equals("English")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.english);
                profileIntent.putExtra("User Name","English");
                profileIntent.putExtra("Followers","9,9 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.english);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Eduction")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.education);
                profileIntent.putExtra("User Name","Education");
                profileIntent.putExtra("Followers","17,6 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.education);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Geography")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.geography);
                profileIntent.putExtra("User Name","Geography");
                profileIntent.putExtra("Followers","8,6 JT");
                profileIntent.putExtra("Following","4");
                profileIntent.putExtra("Postingan", R.drawable.geography);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("History")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.history);
                profileIntent.putExtra("User Name","History");
                profileIntent.putExtra("Followers","3,4 JT");
                profileIntent.putExtra("Following","0");
                profileIntent.putExtra("Postingan", R.drawable.history);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Jerman")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.jerman);
                profileIntent.putExtra("User Name","Germany");
                profileIntent.putExtra("Followers","5,4 JT");
                profileIntent.putExtra("Following","3");
                profileIntent.putExtra("Postingan", R.drawable.jerman);
                context.startActivity(profileIntent);
            } if(stories.get(position).getUsername().equals("Tech")){
                Intent profileIntent = new Intent(context, ActivityProfil.class);
                profileIntent.putExtra("Profile Photo",R.drawable.tech);
                profileIntent.putExtra("User Name","tech");
                profileIntent.putExtra("Followers","2,4 JT");
                profileIntent.putExtra("Following","1");
                profileIntent.putExtra("Postingan", R.drawable.tech);
                context.startActivity(profileIntent);
            }
        });

        holder.imageView.setOnClickListener(v -> {
            if(stories.get(position).getImage().equals(R.drawable.math)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.math);
                storyIntent.putExtra("User Name", "Math");
                storyIntent.putExtra("Story", R.drawable.math);
                context.startActivity(storyIntent);
            } if(stories.get(position).getImage().equals(R.drawable.art)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.art);
                storyIntent.putExtra("User Name", "Art");
                storyIntent.putExtra("Story", R.drawable.art);
                context.startActivity(storyIntent);
            } if(stories.get(position).getImage().equals(R.drawable.science)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.science);
                storyIntent.putExtra("User Name", "Science");
                storyIntent.putExtra("Story", R.drawable.science);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.english)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.english);
                storyIntent.putExtra("User Name", "English");
                storyIntent.putExtra("Story", R.drawable.english);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.education)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.education);
                storyIntent.putExtra("User Name", "Education");
                storyIntent.putExtra("Story", R.drawable.education);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.geography)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.geography);
                storyIntent.putExtra("User Name", "Geography");
                storyIntent.putExtra("Story", R.drawable.geography);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.history)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.history);
                storyIntent.putExtra("User Name", "History");
                storyIntent.putExtra("Story", R.drawable.history);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.sport)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.sport);
                storyIntent.putExtra("User Name", "Sport");
                storyIntent.putExtra("Story", R.drawable.sport);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.jerman)){
                Intent storyIntent = new Intent(context, StoryActivity.class);
                storyIntent.putExtra("Profile Photo", R.drawable.jerman);
                storyIntent.putExtra("User Name", "Germany");
                storyIntent.putExtra("Story", R.drawable.jerman);
                context.startActivity(storyIntent);
            }if(stories.get(position).getImage().equals(R.drawable.tech)){
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
        return stories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageView;
        private TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_image);
            textView = itemView.findViewById(R.id.tv_uname);
        }

        public void setData(Story story) {
            imageView.setImageResource(story.getImage());
            textView.setText(story.getUsername());
        }
    }
}
