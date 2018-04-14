package com.gmail.hmazud;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by mhr on 28/10/2017.
 */

public class Portofolio extends AppCompatActivity {
        public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.portofolio_layout);

                getSupportActionBar().setDisplayHomeAsUpEnabled(true);

                //menerima Intent yang dikirim
                Intent i = this.getIntent();

                //link to web
                Intent linkWeb = new Intent(Intent.ACTION_VIEW);
                linkWeb.setData(Uri.parse("https://github.com/mazud21/"));
                startActivity(linkWeb);

        }
}