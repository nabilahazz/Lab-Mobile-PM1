package com.example.tuprak_3;

import java.util.ArrayList;

public class DataSource {
    public static ArrayList<Post> posts = generateDummyPosts();
    public static ArrayList<InstaStory> instaStories = generateDummyStories();
    public static ArrayList<Profile> profiles = generateDummyProfiles();
    public static ArrayList<Feeds> feeds = generateDummyFeeds();

    //Feeds
    private static ArrayList<Feeds> generateDummyFeeds() {
        ArrayList<Feeds> feeds = new ArrayList<>();
        feeds.add(new Feeds(R.drawable.genshin_avatar, "genshinimpact", "21h", R.drawable.genshin_story));

        feeds.add(new Feeds(R.drawable.gamerwk_avatar, "gamerwk_id", "1h", R.drawable.gamerwk_post));

        feeds.add(new Feeds(R.drawable.akane_avatar, "akanecco_2323", "12m", R.drawable.akane_story));

        feeds.add(new Feeds(R.drawable.mlbb_avatar, "realmobilelegendsid", "32m", R.drawable.mlbb_story));

        feeds.add(new Feeds(R.drawable.ww_avatar, "wuthering_waves", "12h", R.drawable.ww_story));

        feeds.add(new Feeds(R.drawable.hsr_avatar, "honkaistarrail", "23h", R.drawable.hsr_story));

        feeds.add(new Feeds(R.drawable.mpl_avatar, "mpl.id.official", "13h", R.drawable.mpl_story));

        feeds.add(new Feeds(R.drawable.oppo_avatar, "oppoindonesia", "7h", R.drawable.oppo_story));

        feeds.add(new Feeds(R.drawable.samsung_avatar, "samsungindonesia", "18m", R.drawable.samsung_story));

        return feeds;
    }

    //Profile
    private static ArrayList<Profile> generateDummyProfiles() {
        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("mpl.id.official", R.drawable.mpl_avatar, "6.5M", "186", "MPL Indonesia\n" +
                "Video Game\n" +
                "Seru-seruan bareng di TikTok! \uD83D\uDE4C\uD83E\uDD73\n" +
                "Jangan lupa follow yagesya! ✨", R.drawable.mpl_post));

        profiles.add(new Profile("genshinimpact", R.drawable.genshin_avatar, "3.7M", "4", "Genshin Impact\nIn the world of Teyvat — where all kinds of elemental powers constantly surge — epic adventures await, fearless travelers!\n" +
                "hoyo.link/2MfgFBAL", R.drawable.genshin_post));


        profiles.add(new Profile("gamerwk_id", R.drawable.gamerwk_avatar, "5,210", "4", "Gamerwk\n" +
                "Media/news company\n" +
                "Media Indonesia yang berfokus pada industri game hingga pop culture Jepang.\n" +
                "Business: advertising@gamerwk.com", R.drawable.gamerwk_post));

        profiles.add(new Profile("wuthering_waves", R.drawable.ww_avatar, "58.4K", "0", "Wuthering Waves\n" +
                "Wuthering Waves is a story-rich open-world game with a high degree of freedom. It is currently under development. Follow us for more information.", R.drawable.ww_post));

        profiles.add(new Profile("akanecco_2323", R.drawable.akane_avatar, "314K", "5", "黒川あかね Akane Kurokawa\n" +
                "Personal blog\n" +
                "女優\uD83C\uDFAC\n" +
                "『劇団ララライ』", R.drawable.akane_post));

        profiles.add(new Profile("honkaistarrail", R.drawable.hsr_avatar, "1M", "3", "Honkai: Star Rail Official\n" +
                "Honkai: Star Rail is a new HoYoverse space fantasy RPG. Use #honkaistarrail or tag our account to share your incredible fanart and creations with us!\n" +
                "hoyo.link/fd1WCCAd", R.drawable.hsr_post));

        profiles.add(new Profile("samsungindonesia", R.drawable.samsung_avatar, "2.2M", "42", "Samsung Indonesia\n" +
                "New #GalaxyA55 5G & #GalaxyA35 5G. Get special offers & be #AwesomeEveryday", R.drawable.samsung_post));

        profiles.add(new Profile("lalalalisa_m", R.drawable.lisa_avatar, "102M", "0", "LISA\n" +
                "\uD83D\uDDA4\uD83D\uDC97", R.drawable.lisa_post));

        profiles.add(new Profile("realmobilelegendsid", R.drawable.mlbb_avatar, "11.8M", "14", "Mobile Legends: Bang Bang (ID)\n" +
                "Game Publisher\n" +
                "Official Account\n" +
                "Follow dan Like akun social media kita, yuk!\n" +
                "MLBB Bagi THR bisa cek di sini\n" +
                "\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\n" +
                "linktr.ee/MLBBID", R.drawable.mlbb_post));

        profiles.add(new Profile("oppoindonesia", R.drawable.oppo_avatar, "1.8M", "15", "OPPO Indonesia\n" +
                "Brand\n" +
                "OPPO adalah merek perangkat pintar global terkemuka. Miliki #OPPOReno11Series5G", R.drawable.oppo_post));

        return profiles;
    }

    //Post
    private static ArrayList<Post> generateDummyPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post(R.drawable.genshin_avatar, "genshinimpact", R.drawable.genshin_post, "1796 likes", "\"Proyek Revitalisasi Pariwisata di Mondstadt\" ... Bangkrut!\n" +
                "\"*huff* ... Sepertinya aku salah hitung total biaya yang diperlukan proyek ini ... Aku bahkan tidak punya cukup uang untuk memulainya! Tapi kalau aku cabut sekarang, masih ada peluang potong kerugian dan coba lagi nanti ... Silakan ambil ini sebagai tanda terima kasihku, aku akan mengandalkanmu lagi lain kali, dukung aku terus ya!\n" +
                "Ambil Hadiah (Primogem ×40)\n" +
                ">> https://hoyo.link/5hAiFCAL\n" +
                "* Hadiah bisa diambil sebelum 3 April 2024 23:59 (UTC+8). Silakan segera kunjungi halaman web untuk mengambil hadiahnya.\n" +
                "* Setelah mengambil hadiah dari halaman web, hadiah akan dikirimkan melalui pesan dalam game, dan akan kedaluwarsa dalam 30 hari. Jangan lupa untuk segera mengambilnya ya.\n" +
                "#MondstadtTourism #GenshinImpact", "15 hours ago"));

        posts.add(new Post(R.drawable.samsung_avatar, "samsungindonesia", R.drawable.samsung_post, "395 likes", "Asah kreativitas dan imajinasi si Kecil selama bulan Ramadan dengan #GalaxyTabA9 \uD83D\uDE80✨\n" +
                "\n" +
                "Ajak si Kecil bermain & belajar dengan berbagai aplikasi hiburan dan edukasi yang ada di Samsung Kids. Dapatkan promo #MakinManTAB cashback sampai Rp 200.000, klik link di bio!", "3 days ago"));

        posts.add(new Post(R.drawable.akane_avatar, "akanecco_2323", R.drawable.akane_post, "110,382 likes", "私頑張ったから、きっと来てくれるよね。。。\n" +
                "早く来ないかな？\n" +
                "メリークリスマス~!", "December 24, 2023"));

        posts.add(new Post(R.drawable.mlbb_avatar, "realmobilelegendsid", R.drawable.mlbb_post, "24,969 likes", "Orang yang komen di postingan ini dapat 10000 diamond! \n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "Tapi boong \uD83D\uDE0B yang ga boong cuma StarLight April Lylia  \"\"Magitech Arsenal\"\" udah rilis yaa! #AprilMop #mlbb #mlbbid #mobilelegends #mobilelegendsid #StarLightLylia #Lylia", "17 hours ago"));

        posts.add(new Post(R.drawable.mpl_avatar, "mpl.id.official", R.drawable.mpl_post, "Liked by realmobilelegendsid and 109,605 others", "Pengumuman Pemenang! MPL ID Bagi Berkah Ramadhan Bersama Samsung Galaxy \uD83E\uDD29\n" +
                "Selamat kepada para pemenang! Untuk kelanjutannya akan kami hubungi melalui email official MPL Indonesia. Bagi kalian yang belum kebagian dan belum ikutan jangan berkecil hati dulu, nantikan kesempatan lainnya bersama Samsung Galaxy dengan cara tonton terus MPL ID S13 di MPL Arena dan beli tiket sebanyak - banyaknya!\n" +
                "Beli tiket di id-mpl.com/ticket\n" +
                "#WeOwnThis #MPLIDS13 #MPLIDBAGIBERKAHRAMADHANBERSAMASAMSUNGGALAXY", "1 day ago"));

        posts.add(new Post(R.drawable.ww_avatar, "wuthering_waves", R.drawable.ww_post, "Liked by gamerwk_id and 21,441 others", "Open-world Action RPG Wuthering Waves is set to release on 2024/05/22 (PT) on PC, iOS, Android, and Epic Games Store. Pre-registration is now open on various platforms!\n" +
                "Pre-register now: https://akioversea.onelink.me/lKVo/7n76bkvu\n" +
                "\n" +
                "✦WAKING OF A WORLD✦\n" +
                "\n" +
                "#WutheringWaves\n" +
                "#WutheringWavesLaunch", "15 hours ago"));

        posts.add(new Post(R.drawable.hsr_avatar, "honkaistarrail", R.drawable.hsr_post, "352 likes", "Berita Pertahanan Gelombang Super Kuat | Pom-Pom\n" +
                "\"Serahkan semuanya padaku — !\"\n" +
                "Artis tersohor di alam semesta, telinganya panjang dan matanya berkilau.\n" +
                "Berjuang untuk melindungi kota dan jadilah pejuang perintisan yang hebat!\n" +
                "#FilmEfekSpesialStarRail\n" +
                "#Pom-PomMengguncangOscar\n" +
                "#PomPomPower\n" +
                "#AprilFoolsHSR", "23 hours ago"));

        posts.add(new Post(R.drawable.lisa_avatar, "lalalalisa_m", R.drawable.lisa_post, "7,432,676 likes", "\"A special night with @bulgari & first public look with my 2nd watch collab \uD83D\uDDA4\n" +
                "\n" +
                "#불가리 #BulgariStudio #Bzero1", "March 17"));

        posts.add(new Post(R.drawable.oppo_avatar, "oppoindonesia", R.drawable.oppo_post, "1,105 likes", "Siapa yang sudah bersiap untuk menyambut hari Raya? Komen apa saja yang sudah kamu siapkan! \uD83D\uDC47✍\uFE0F\n" +
                "\n" +
                "Raih #OPPOBerkahRamadan sekarang bareng #OPPOReno11F \uD83D\uDED2\n" +
                "\n" +
                "#ThePortraitExpert #FantasticReno", "6 days ago"));

        posts.add(new Post(R.drawable.gamerwk_avatar, "gamerwk_id", R.drawable.gamerwk_post, "Liked by wuthering_waves and 235 others", "\uD835\uDDEA\uD835\uDE02\uD835\uDE01\uD835\uDDF5\uD835\uDDF2\uD835\uDDFF\uD835\uDDF6\uD835\uDDFB\uD835\uDDF4 \uD835\uDDEA\uD835\uDDEE\uD835\uDE03\uD835\uDDF2\uD835\uDE00 \uD835\uDDE3\uD835\uDDEE\uD835\uDE00\uD835\uDE01\uD835\uDDF6\uD835\uDDF8\uD835\uDDEE\uD835\uDDFB \uD835\uDDE5\uD835\uDDF6\uD835\uDDF9\uD835\uDDF6\uD835\uDE00 \uD835\uDFEE\uD835\uDFEF \uD835\uDDE0\uD835\uDDF2\uD835\uDDF6 \uD835\uDE02\uD835\uDDFB\uD835\uDE01\uD835\uDE02\uD835\uDDF8 \uD835\uDDE0\uD835\uDDFC\uD835\uDDEF\uD835\uDDF6\uD835\uDDF9\uD835\uDDF2 \uD835\uDDF1\uD835\uDDEE\uD835\uDDFB \uD835\uDDE3\uD835\uDDD6\n" +
                "\n" +
                "Kuro Games akhirnya memberi konfirmasi resmi untuk jadwal rilis Wuthering Waves yang ternyata memang jatuh pada 23 Mei mendatang.\n" +
                "\n" +
                "Melalui sesi Special Broadcast beberapa saat lalu, mereka ikut membagikan beragam info tambahan termasuk ketersediaan gamenya secara serempak untuk platform Android, iOS, PC, dan Epic Games Store.\n" +
                "\n" +
                "Bagi yang mengharapkan adanya versi PlayStation untuk sementara ini belum ada konfirmasi apapun. Tapi jika mereka memang berencana untuk membawa gamenya ke PS5, maka rilisnya baru akan menyusul pada jadwal terpisah di masa depan.\n" +
                "\n" +
                "#WutheringWaves #KuroGames", "3 days ago"));
        return posts;
    }


    //Story
    private static ArrayList<InstaStory> generateDummyStories() {
        ArrayList<InstaStory> instaStories = new ArrayList<>();
        instaStories.add(new InstaStory(R.drawable.akane_avatar, "akanecco_2323"));
        instaStories.add(new InstaStory(R.drawable.ww_avatar, "wuthering_waves"));
        instaStories.add(new InstaStory(R.drawable.genshin_avatar, "genshinimpact"));
        instaStories.add(new InstaStory(R.drawable.mlbb_avatar, "realmobilelegendsid"));
        instaStories.add(new InstaStory(R.drawable.samsung_avatar, "samsungindonesia"));
        instaStories.add(new InstaStory(R.drawable.mpl_avatar, "mpl.id.official"));
        instaStories.add(new InstaStory(R.drawable.hsr_avatar, "honkaistarrail"));
        instaStories.add(new InstaStory(R.drawable.gamerwk_avatar, "gamerwk_id"));
        instaStories.add(new InstaStory(R.drawable.oppo_avatar, "oppoindonesia"));
        return instaStories;
    }
}