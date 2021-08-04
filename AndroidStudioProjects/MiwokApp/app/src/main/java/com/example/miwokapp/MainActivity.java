package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView numbers=findViewById(R.id.numbers);
         numbers.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent num=new Intent(MainActivity.this,NumbersActivity.class);
                 startActivity(num);
             }
         });

         TextView fm=findViewById(R.id.family_members);
         fm.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v)
             {
                 Intent fam=new Intent(MainActivity.this,FamilyActivity.class);
                 startActivity(fam);
             }
         });

        TextView colors=findViewById(R.id.colors);
        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent colors=new Intent(MainActivity.this, Colors.class);
                startActivity(colors);
            }
        });

        TextView phrases=findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phrases=new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(phrases);
            }
        });
    }
//    public void numbersActivity(View view)
//    {
//        Intent i=new Intent(this,NumbersActivity.class);
//        startActivity(i);
//    }
}