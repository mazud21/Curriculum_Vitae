package com.gmail.hmazud;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * Created by mhr on 28/10/2017.
 */

public class DataDiri extends AppCompatActivity{
public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_diri_layout);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //TextView txtChild = (TextView) findViewById(R.id.txtDataDiri);

        //menerima Intent yang dikirim
        Intent i = this.getIntent();
       // txtChild.setText("This is child " + i.getStringExtra("pesan"));
        }
}
