package com.pam.recyclerviewkontak_2500;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private String[] kontak = {"Rizka","Ade Ambyar","Fia Amara",
            "ZulZulnaen","Iron Man","Hulk Ijo", "Pak Sulaiman",
            "Akang Bakso","Kakak Kembar","Toko Aqua","Ipeh","Kampus",
            "Ibu Kos"};

    private String[] no_kontak = {"082525262629","081254698299","083649827549",
            "087159123486","085124326965","083254256125", "087546921569",
            "081753951258","087954326584","082365314328","085412179654","027456891",
            "082356254985"};

    private ArrayList<Kontak> kontakList;

    private RecyclerView rvKontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kontakList = new ArrayList<>();

        for (int i = 0; i<(kontak.length); i++){
            Kontak kon = new Kontak(kontak[i],no_kontak[i]);
            kontakList.add(kon);
        }

        rvKontak = findViewById(R.id.rv_kontak);
        rvKontak.setHasFixedSize(true);

        rvKontak.setLayoutManager(new LinearLayoutManager(this));

        KontakAdapter kontakAdapter = new KontakAdapter(kontakList);
        rvKontak.setAdapter(kontakAdapter);
    }
}