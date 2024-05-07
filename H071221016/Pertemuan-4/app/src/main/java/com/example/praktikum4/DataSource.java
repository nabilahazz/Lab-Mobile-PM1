package com.example.praktikum4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<User> users = generateDummyUser();

    private static ArrayList<User> generateDummyUser() {
        ArrayList<User> users1 = new ArrayList<>();
        users1.add(new User("Art","art"
                ,"Art is education that aims to hone students' sensitivity, creativity and aesthetic taste in art, develop students' ethics, social awareness and cultural awareness in social life.",R.drawable.art,R.drawable.art));

        users1.add(new User("Education", "education"
                ,"Education is a planned basic effort to create a learning atmosphere and learning process so that students actively develop their potential to have religious spiritual strength, self-control, personality, intelligence, morals, life sciences, general knowledge and the skills they need for society based on the Law. Invite"
                ,R.drawable.education,R.drawable.education));

        users1.add(new User("Geography", "geography"
                ,"Geography is a science that studies all human and natural activities and the interactions between the two through a spatial perspective to form certain spatial patterns."
                ,R.drawable.geography, R.drawable.geography));

        users1.add((new User("Math","math"
                ,"Mathematics is a pattern of thinking, a pattern of organizing, logical proof, mathematics is a language that uses terms that are defined carefully, clearly and accurately, its representation is with symbols and conciseness, it is more of a symbolic language about ideas than about sounds."
                ,R.drawable.math,R.drawable.math)));

        users1.add(new User("Sport", "sport"
                    ,"Sport is an educational process that utilizes physical activity to produce holistic changes in individual quality, both in physical, mental and emotional form"
                ,R.drawable.sport,R.drawable.sport));

        users1.add(new User("Tech","tech"
                ,"tech is a field of study that focuses on the use of technology to support and improve the learning and teaching process"
                ,R.drawable.tech, R.drawable.tech));
        return users1;
    }
}