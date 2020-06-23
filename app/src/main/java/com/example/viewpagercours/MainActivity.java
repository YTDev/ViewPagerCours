package com.example.viewpagercours;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager VP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VP=findViewById(R.id.VP);
        PagerAdapter PA=new PagerAdapter(getSupportFragmentManager());
        VP.setAdapter(PA);

    }
}
