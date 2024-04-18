package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();
        instagrams1.add(new Instagram("Anastasya_90","aca"
                ,"Beach",R.drawable.po1,R.drawable.post1));

        instagrams1.add(new Instagram("upilania_Putri.01", "upil"
                ,"Twilight and Sky"
                ,R.drawable.po2,R.drawable.post2));

        instagrams1.add(new Instagram("Dinda_Hauw35", "dinda"
                ,"Favorite Vibes"
                ,R.drawable.po3, R.drawable.post3));

        instagrams1.add((new Instagram("imimelia_","Lia"
                ,"Tempat ternyaman untuk tenang"
                ,R.drawable.po4,R.drawable.post4)));

        instagrams1.add(new Instagram("CintaLau__", "sic"
                ,"aku dan senja"
                ,R.drawable.post5,R.drawable.post5));

        instagrams1.add(new Instagram("Azzzhra00","zahra"
                ,"beach in my life"
                ,R.drawable.po6, R.drawable.post6));

        instagrams1.add(new Instagram("OpanEmbul_20","gembul"
                , "For to day"
                ,R.drawable.post7,R.drawable.post7));

        instagrams1.add(new Instagram("Nurhikmah._","ican"
                ,"aku kamu dan pantai"
                ,R.drawable.po8, R.drawable.post8));

        instagrams1.add(new Instagram("Senja_Vibes", "senja"
                ,"obat penenang paling ampuh"
                ,R.drawable.po9, R.drawable.post9));

        instagrams1.add(new Instagram("Langit.Sore", "Orange"
                ,"Tenang hening nyaman *Galau"
                ,R.drawable.po10, R.drawable.post10));
        return instagrams1;
    }
}