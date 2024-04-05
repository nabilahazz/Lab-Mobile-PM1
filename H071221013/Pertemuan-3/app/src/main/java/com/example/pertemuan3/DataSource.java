package com.example.pertemuan3;

import java.util.ArrayList;

//menyimpan seluruh data pd aplikasi
public class DataSource {

    public static ArrayList<SaveVariabel> saveVariabels = generateDummyFood();

    private static ArrayList<SaveVariabel> generateDummyFood() {
        ArrayList<SaveVariabel> saveVariabels = new ArrayList<>();
        saveVariabels.add(new SaveVariabel("Kawisari Cafe", "Menu andalan di bulan ramadhan, beli 2 gratis 3. Buruuann order jangan sampai kehabisan", R.drawable.kawisarip, R.drawable.kawisari, R.drawable.kawisari,1000000, 200));
        saveVariabels.add(new SaveVariabel("Pizza Hut", "Guris nya pas, cocok untuk buka bersama keluarga", R.drawable.pizzap, R.drawable.pizza, R.drawable.pizza, 5000000, 10));
        saveVariabels.add(new SaveVariabel("Solaria.Mtos", "Dengan nuansa yang sangat ramah dan harga terjangkau, Solaria Mtos siap melayani anda semua", R.drawable.solariap, R.drawable.solaria, R.drawable.solaria, 1000000, 2000));
        saveVariabels.add(new SaveVariabel("Marugame Udon.Nippah", "Menu terbaru dari Merugame Udon, rasa di jamin nagihh", R.drawable.udonp, R.drawable.marugame, R.drawable.marugame, 500000, 138));
        saveVariabels.add(new SaveVariabel("Official_Gacoan", "Cabang Gacoan kini hadir kembali di Perintis depan UNHAS", R.drawable.gacoanp, R.drawable.gacoan, R.drawable.gacoan, 3000000, 7600));
        saveVariabels.add(new SaveVariabel("Lazuna Pk7", "Makanan anak Kos", R.drawable.lazunap, R.drawable.lazuna, R.drawable.lazuna, 89000, 64));
        saveVariabels.add(new SaveVariabel("TeSaTe", "Bosan dengan ayam geprek? Beli sate solusinya!!", R.drawable.satep, R.drawable.tesate, R.drawable.tesate, 95678000, 980));
        saveVariabels.add(new SaveVariabel("Bebek Ireng", "Dengan kekayaan rempah pada Sambal Irenge memberikan cita rasa yang luar biasa LEZATT", R.drawable.berengp, R.drawable.bereng, R.drawable.bereng, 3000, 4221));
        saveVariabels.add(new SaveVariabel("Begos.id", "Bebek Goyang Sulawesi, Andalan Orang Sulawesi", R.drawable.begosp, R.drawable.begos, R.drawable.begos, 110000, 567));
        saveVariabels.add(new SaveVariabel("Rempah_Bistro.id", "Mantapp", R.drawable.rempahp, R.drawable.rempahbistro, R.drawable.rempahbistro, 90000, 5670));
        return saveVariabels;
    }
}
