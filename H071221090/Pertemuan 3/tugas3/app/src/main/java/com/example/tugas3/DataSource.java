package com.example.tugas3;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyUniversities();

    private static ArrayList<Instagram> generateDummyUniversities() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Gigi Hadid", "pretty recent ..", R.drawable.gigi, R.drawable.gigi2, R.drawable.gigi3,"78.3 JT", "1.505"));
        instagrams1.add(new Instagram("Selena Gomez", "lOvE On +", R.drawable.selena, R.drawable.selena, R.drawable.selena3, "429 JT", "295"));
        instagrams1.add(new Instagram("Zayn Malik", "WHAT I AM OUT NOW", R.drawable.zayn, R.drawable.zayn, R.drawable.zayn3, "52.3 JT", "15"));
        instagrams1.add(new Instagram("Hailey Bieber", "sugarplum", R.drawable.hailey, R.drawable.hailey, R.drawable.hailey3, "51.1 JT", "931"));
        instagrams1.add(new Instagram("Justin Bieber", "Arrrrrrrrrrrrrrr", R.drawable.justin, R.drawable.justin, R.drawable.justin3, "292 JT", "777"));
        instagrams1.add(new Instagram("Kylie Jenner", "hellooooo", R.drawable.kylie, R.drawable.kylie, R.drawable.kylie3, "400 JT", "98"));
        instagrams1.add(new Instagram("Kendal Jenner", "dress of my dreams", R.drawable.kendal, R.drawable.kendal, R.drawable.kendal3, "294 JT", "242"));
        instagrams1.add(new Instagram("Travis Scott", "RICK FOR SNL", R.drawable.travis, R.drawable.travis, R.drawable.travis3, "55 JT", "99"));
        instagrams1.add(new Instagram("Taylor Swift", "I miss u like it was the very first night", R.drawable.taylor, R.drawable.taylor, R.drawable.taylor3, "283 JT", "0"));
        instagrams1.add(new Instagram("Olivia Rodrigo", "today is my last day of being able to underage drink (hypothetically)!!!", R.drawable.olivia, R.drawable.olivia, R.drawable.olivia3, "36,9 JT", "0"));
        return instagrams1;
    }
}

