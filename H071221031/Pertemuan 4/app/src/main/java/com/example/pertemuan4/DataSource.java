package com.example.pertemuan4;

import java.util.ArrayList;

public class DataSource {

    public static ArrayList<Instagram> instagrams = generateDummyInstagrams();

    private static ArrayList<Instagram> generateDummyInstagrams() {
        ArrayList<Instagram> instagrams1 = new ArrayList<>();

        instagrams1.add(new Instagram("ummmmm_j.i","Umji"
                ,"1년이 또 차곡 쌓였네 2주년 너무 축하해 우리 멤버들 고맙고 사랑해 @viviz_official 두. 살 . ♡"
                ,R.drawable.umji,R.drawable.umji));

        instagrams1.add(new Instagram("wow_kimsohyun", "Kim So Hyun"
                ,"\uD83E\uDD0D #CHANEL #J12 #CHANELWatches #Ad"
                ,R.drawable.kimsohyun,R.drawable.kimsohyun));

        instagrams1.add(new Instagram("shinseulkee", "Shin Seul-Ki"
                ,"지금부터 마지막 피라미드게임을 시작할게"
                ,R.drawable.shin, R.drawable.shin));

        instagrams1.add((new Instagram("goyounjung","Go Yoon Jung"
                ,"장희수의 하루☂️\uD83C\uDFC3\u200D♀️\uD83D\uDC4A\uD83D\uDE34"
                ,R.drawable.gyj,R.drawable.gyj)));

        instagrams1.add(new Instagram("mina_sr_my", "Mina Twice"
                ,"タイムレスな魅力で愛されるフェンディのアイコンバッグ「ピーカブー」を持って撮影しました"
                ,R.drawable.mina,R.drawable.mina));

        instagrams1.add(new Instagram("xeesoxee","Han So Hee"
                ,"설이와 수안이의 겨울"
                ,R.drawable.hansohe, R.drawable.hansohe));

        instagrams1.add(new Instagram("imwinter","Winter Aespa"
                , "Kcon Hong Kong❤️"
                ,R.drawable.winter,R.drawable.winter));

        instagrams1.add(new Instagram("eunbining0904","Park Eunbi"
                ,"회\uD83C\uDF0A #무인도의디바 하는 날~\uD83E\uDE75\uD83D\uDC99 밤 9시 20분을 기다려 주세요!!!"
                ,R.drawable.eunbi, R.drawable.eunbi));

        instagrams1.add(new Instagram("nmixx_official", "Nmixx"
                ,"with Roger Vivier "
                ,R.drawable.nmixx, R.drawable.nmixx));

        instagrams1.add(new Instagram("kimtaeri_official", "Kim Tae Ri"
                ,"연습은 실전처럼 실전은 연습처럼"
                ,R.drawable.kimtaeri, R.drawable.kimtaeri));
        return instagrams1;
    }
}
