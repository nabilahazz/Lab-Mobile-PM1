package com.example.pertemuan5;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams =generateDummyInstagram();

    private static ArrayList<Instagram> generateDummyInstagram() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Aan", "Aan Syawaluddin Adi Putra", "Strength Training"
                ,R.drawable.satu, R.drawable.satu));

        instagrams1.add(new Instagram("lyrywy_", "Ikki Fahrezi", "Foto Bulan"
                ,R.drawable.dua, R.drawable.dua));

        instagrams1.add(new Instagram("chookisss", "Farhan Abdullah", "FolksRun Sulsel"
                ,R.drawable.tiga, R.drawable.tiga));

        instagrams1.add(new Instagram("realmadrid", "Real Madrid CF", "Barca Sepele"
                ,R.drawable.empat, R.drawable.empat));

        return instagrams1;

    }

}
