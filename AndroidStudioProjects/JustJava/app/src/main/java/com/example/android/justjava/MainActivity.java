package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int a=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void display(int n)
    {
        TextView tv=(TextView)findViewById(R.id.count);
        tv.setText(""+n);
    }

    public void inc(View view)
    {
        a=a+1;
        display(a);
        set_price(a);
    }

    public String ordersummary()
    {
        String text="Name: Kunal\nQuantity:"+a+"\nTotal: $"+calculate_price(a)+"\nThank You!";
        return text;

    }

    public void dec(View view)
    {
        if(a<=0)
        {
            a=0;
        }
        else
        {
            a=a-1;
        }
        display(a);
        set_price(a);
    }
    public void set_price(int x)
    {
        int price=calculate_price(x);
        TextView xd=(TextView)findViewById(R.id.tot);
        xd.setText("$"+(price));
    }
    private int calculate_price(int x)
    {
        int price=x*5;
        return price;
    }
    public void submitOrder(View view)
    {
        TextView tv=(TextView)findViewById(R.id.tot);
        String a=ordersummary();
        tv.setText(a);
    }
}