package com.gmail.hmazud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mhr on 28/10/2017.
 */

public class Kontak extends AppCompatActivity{
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.kontak_layout);

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                 //menerima Intent yang dikirim
                Intent i = this.getIntent();
                }
}
