package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);

        ArrayList<Conversion> fam=new ArrayList<Conversion>();
        fam.add(new Conversion("әpә","father",R.drawable.family_father,R.raw.family_father));
        fam.add(new Conversion("әṭa","mother",R.drawable.family_mother,R.raw.family_mother));
        fam.add(new Conversion("angsi","son",R.drawable.family_son,R.raw.family_son));
        fam.add(new Conversion("tune","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        fam.add(new Conversion("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        fam.add(new Conversion("chalitti","younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        fam.add(new Conversion("teṭe","older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        fam.add(new Conversion("kolliti","younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        fam.add(new Conversion("ama","grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        fam.add(new Conversion("paapa","grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));

        Adapter family= new Adapter(this,fam, Color.parseColor("#2D9C05"));
        ListView ls=findViewById(R.id.list);
        ls.setAdapter(family);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Adapter.releaseMediaPlayer();
    }
}