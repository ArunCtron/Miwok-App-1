package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        ArrayList<Conversion> phrses=new ArrayList<Conversion>();
        phrses.add(new Conversion("minto wuksus","Where are you going?",R.raw.phrase_where_are_you_going));
        phrses.add(new Conversion("tinnә oyaase'nә","What is your name?",R.raw.phrase_what_is_your_name));
        phrses.add(new Conversion("oyaaset...","My name is...",R.raw.phrase_my_name_is));
        phrses.add(new Conversion("michәksәs?","How are you feeling?",R.raw.phrase_how_are_you_feeling));
        phrses.add(new Conversion("kuchi achit","I’m feeling good.",R.raw.phrase_im_feeling_good));
        phrses.add(new Conversion("әәnәs'aa?","Are you coming?",R.raw.phrase_are_you_coming));
        phrses.add(new Conversion("hәә’ әәnәm","Yes, I’m coming.",R.raw.phrase_yes_im_coming));
        phrses.add(new Conversion("әәnәm","I’m coming.",R.raw.phrase_im_coming));
        phrses.add(new Conversion("yoowutis","Let’s go.",R.raw.phrase_lets_go));
        phrses.add(new Conversion("әnni'nem","Come Here.",R.raw.phrase_come_here));


        ListView x=findViewById(R.id.list);
        Adapter phrases=new Adapter(this,phrses, Color.parseColor("#03B4CC"));
        x.setAdapter(phrases);

    }
    @Override
    protected void onStop() {
        super.onStop();
        Adapter.releaseMediaPlayer();
    }
}