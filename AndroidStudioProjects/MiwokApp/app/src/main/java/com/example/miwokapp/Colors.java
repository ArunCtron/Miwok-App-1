package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Conversion> colorList=new ArrayList<Conversion>();
        colorList.add(new Conversion("weṭeṭṭi","red",R.drawable.color_red,R.raw.color_red));
        colorList.add(new Conversion("chokokki","green",R.drawable.color_green,R.raw.color_green));
        colorList.add(new Conversion("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        colorList.add(new Conversion("ṭopoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        colorList.add(new Conversion("kululli","black",R.drawable.color_black,R.raw.color_black));
        colorList.add(new Conversion("kelelli","white",R.drawable.color_white,R.raw.color_white));
        colorList.add(new Conversion("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colorList.add(new Conversion("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));

        ListView col=findViewById(R.id.list);
        Adapter color=new Adapter(this,colorList, Color.parseColor("#9504B5"));
        col.setAdapter(color);

    }
    @Override
    protected void onStop() {
        super.onStop();
        Adapter.releaseMediaPlayer();
    }
}