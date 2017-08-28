package com.example.apppromotersapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.apppromoters.AppPromoters;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new AppPromoters(this,getPackageName(),1);
        // (this,package name,popup interval in minutes)
    }
}
