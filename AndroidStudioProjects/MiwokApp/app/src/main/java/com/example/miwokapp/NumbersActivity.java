package com.example.miwokapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        String []eng= new String[10];
        eng[0]="One";
        eng[1]="Two";
        eng[2]="Three";
        eng[3]="Four";
        eng[4]="Five";
        eng[5]="Six";
        eng[6]="Seven";
        eng[7]="Eight";
        eng[8]="Nine";
        eng[9]="Ten";
    }
}