package com.example.praktikum3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Story> stories = generateDummyStories();

    private static ArrayList<Story> generateDummyStories() {
        ArrayList<Story> stories = new ArrayList<>();
        stories.add(new Story( R.drawable.math, "math"));
        stories.add(new Story( R.drawable.art, "Art"));
        stories.add(new Story( R.drawable.science, "Science" ));
        stories.add(new Story( R.drawable.sport, "Sport"));
        stories.add(new Story(R.drawable.english, "English"));
        stories.add(new Story( R.drawable.education, "Education"));
        stories.add(new Story( R.drawable.geography, "Geography"));
        stories.add(new Story( R.drawable.history, "History"));
        stories.add(new Story( R.drawable.jerman, "Germany"));
        stories.add(new Story( R.drawable.tech, "Tech"));
        return stories;
    }

    public static ArrayList<Post> posts = generateDummyPosts();

    private static ArrayList<Post> generateDummyPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(R.drawable.math, R.drawable.math, "Math", "Tuntaskan misteri matematika bersama kami"));
        posts.add(new Post(R.drawable.art, R.drawable.art, "Art", "Ekspresikan kreativitasmu dalam seni!"));
        posts.add(new Post(R.drawable.science, R.drawable.science, "Science", "Telusuri keajaiban sains bersama kami! \n Mari kita jelajahi dunia alam dan pengetahuan bersama!"));
        posts.add(new Post(R.drawable.sport, R.drawable.sport, "Sport", "Jadilah pahlawan lapangan dengan semangat olahraga!"));
        posts.add(new Post(R.drawable.english, R.drawable.english, "English", "Terbangkan imajinasi dengan bahasa Inggris!"));
        posts.add(new Post(R.drawable.education, R.drawable.education, "Education", "Pintar itu keren!"));
        posts.add(new Post(R.drawable.geography, R.drawable.geography, "Geography", "Telusuri keindahan bumi dan budaya dunia!"));
        posts.add(new Post(R.drawable.history, R.drawable.history, "History", "Jejak sejarah membentuk masa depan!"));
        posts.add(new Post(R.drawable.jerman, R.drawable.jerman, "Germany", "Pelajari bahasa Jerman dan jelajahi budaya yang kaya!"));
        posts.add(new Post(R.drawable.tech, R.drawable.tech, "Tech", "Dunia di ujung jari dengan teknologi!"));
        return posts;

    }
}
