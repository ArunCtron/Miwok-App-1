package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

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
        ArrayList<String> num=new ArrayList<String>();
        num.add("One");
        num.add("Two");
        num.add("Three");
        num.add("Four");
        num.add("Five");
        num.add("Six");
        num.add("Seven");
        num.add("Eight");
        num.add("Nine");
        num.add("Ten");

//        LinearLayout view=findViewById(R.id.rootView);
//        for(int i=0;i<num.size();i++)
//        {
//            TextView numb=new TextView(this);
//            numb.setText(num.get(i));
//            view.addView(numb);
//            numb.setTextSize(20)
//        }
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, R.layout.num_layout, num);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

    }
}