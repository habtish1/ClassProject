package com.example.habtish.recyclerview;


import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ItemDesc extends AppCompatActivity {


    Toolbar toolbar;
    ViewPager viewPager;
    com.example.alazar.e_commerce.SlideShowAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolBar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_id);
        adapter = new com.example.alazar.e_commerce.SlideShowAdapter(this);
        viewPager.setAdapter(adapter);

    }





}
