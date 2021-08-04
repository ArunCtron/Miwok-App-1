package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Conversion> num=new ArrayList<Conversion>();
        num.add(new Conversion("Lutti","One",R.drawable.number_one,R.raw.number_one));
        num.add(new Conversion("Otiiko","Two",R.drawable.number_two,R.raw.number_two));
        num.add(new Conversion("Tolookosu","three",R.drawable.number_three,R.raw.number_three));
        num.add(new Conversion("Oyyisa","Four",R.drawable.number_four,R.raw.number_four));
        num.add(new Conversion("Massokka","Five",R.drawable.number_five,R.raw.number_five));
        num.add(new Conversion("Temmokka","Six",R.drawable.number_six,R.raw.number_six));
        num.add(new Conversion("Kenekaku","Seven",R.drawable.number_seven,R.raw.number_seven));
        num.add(new Conversion("Kawinta","Eight",R.drawable.number_eight,R.raw.number_eight));
        num.add(new Conversion("Wo'e","Nine",R.drawable.number_nine,R.raw.number_nine));
        num.add(new Conversion("Na'aacha","Ten",R.drawable.number_ten,R.raw.number_ten));


//        LinearLayout view=findViewById(R.id.rootView);
//        for(int i=0;i<num.size();i++)
//        {
//            TextView numb=new TextView(this);
//            numb.setText(num.get(i));
//            view.addView(numb);
//            numb.setTextSize(20)
//        }
        Adapter itemsAdapter = new Adapter(this,num, Color.parseColor("#FFA100"));
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }

    @Override
    protected void onStop() {
        super.onStop();
        Adapter.releaseMediaPlayer();
    }
}