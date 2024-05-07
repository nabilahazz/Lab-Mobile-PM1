package com.example.pekan5;
import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Tweet> tweets = generateDummyTweets();

    private static ArrayList<Tweet> generateDummyTweets() {
        ArrayList<Tweet> tweetss = new ArrayList<>();
        tweetss.add(new Tweet("math","Math","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.math,R.drawable.math));

        tweetss.add(new Tweet("education","Education","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.education,R.drawable.education));

        tweetss.add(new Tweet("geography","Geography","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.geography,R.drawable.geography));

        tweetss.add(new Tweet("sport","Sport","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.sport,R.drawable.sport));

        tweetss.add(new Tweet("tech","Tech","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
                R.drawable.tech,R.drawable.tech));

        return tweetss;
    }
}

