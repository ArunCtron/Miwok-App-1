package com.example.android.foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.*;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //Setting theme
    public void darkTheme(View view)
    {
        setContentView(R.layout.dark_theme);
    }
    public void lightTheme(View view)
    {
        setContentView(R.layout.activity_main);
    }

    //Function for increment and decrement

    int inc(int v)
    {
        v=v+1;
        return v;
    }
    int dec(int v)
    {
        v=v-1;
        if(v<=0)
            v=0;
        return v;
    }

    //Ends here


    int []a=new int[8];//{0,0,0,0,0,0,0,0};///array declaration
    int []c=new int[8];//{0,0,0,0,0,0,0,0};
    int []p=new int[8];
    int sum=0;
    //Cart Total function
    public void cartTotal(int x)
    {
        TextView cart=findViewById(R.id.cartTotal);
        if(sum<0)
        {
            sum=0;
        }
        else {
            cart.setText("" + x);
        }

        if(sum>0)
        {
            cart.setTextColor(Color.parseColor("#FF6E6E"));
        }
        else
        {
            cart.setTextColor(Color.parseColor("#D6D6D6"));
        }
    }


    //burger
    public void burgerplus(View view)
    {
        a[0]=inc(a[0]);
        TextView tv=findViewById(R.id.countburger);
        tv.setText(""+a[0]);
        sum=sum+1;
        c[0]=0;
        cartTotal(sum);
        p[0]=1;
    }

    public void burgerminus(View view)
    {
        a[0]=dec(a[0]);
        TextView tv=findViewById(R.id.countburger);
        tv.setText(""+a[0]);
        if(sum!=0 && a[0]>0)
        {
            sum = sum - 1;
        }
        if(a[0]==0 && c[0]==0 && p[0]==1)
        {
            sum=sum-1;
            c[0]=1;
        }
        cartTotal(sum);
    }
    //end

    //frenchfries
    public void frenchfriesplus(View view)
    {
        a[1]=inc(a[1]);
        TextView tv=findViewById(R.id.countfrenchfries);
        tv.setText(""+a[1]);
        sum=sum+1;
        c[1]=0;
        p[1]=1;
        cartTotal(sum);
    }

    public void frenchfriesminus(View view)
    {
        a[1]=dec(a[1]);
        TextView tv=findViewById(R.id.countfrenchfries);
        tv.setText(""+a[1]);
        if(sum!=0 && a[1]>0)
        {
            sum = sum - 1;
        }
        if(a[1]==0 && c[1]==0 && p[1]==1)
        {
            sum=sum-1;
            c[1]=1;
        }
        cartTotal(sum);
    }
    //end

    //chickenPizza
    public void chickenpizzaplus(View view)
    {
        a[2]=inc(a[2]);
        TextView tv=findViewById(R.id.countpizza);
        tv.setText(""+a[2]);
        sum=sum+1;
        c[2]=0;
        p[2]=1;
        cartTotal(sum);
    }

    public void chickenpizzaminus(View view)
    {
        a[2]=dec(a[2]);
        TextView tv=findViewById(R.id.countpizza);
        tv.setText(""+a[2]);
        if(sum!=0 && a[2]>0)
        {
            sum = sum - 1;
        }
        if(a[2]==0 && c[2]==0 && p[2]==1)
        {
            sum=sum-1;
            c[2]=1;
        }
        cartTotal(sum);
    }
    //end

    //creamyMushroom
    public void cmushroomplus(View view)
    {
        a[3]=inc(a[3]);
        TextView tv=findViewById(R.id.countcmushroom);
        tv.setText(""+a[3]);
        sum=sum+1;
        c[3]=0;
        p[3]=1;
        cartTotal(sum);
    }

    public void cmushroomminus(View view)
    {
        a[3]=dec(a[3]);
        TextView tv=findViewById(R.id.countcmushroom);
        tv.setText(""+a[3]);
        if(sum!=0 && a[3]>0)
        {
            sum = sum - 1;
        }
        if(a[3]==0 && c[3]==0 && p[3]==1)
        {
            sum=sum-1;
            c[3]=1;
        }
        cartTotal(sum);
    }
    //end

    //Chicken Drumsticks
    public void chckenDsticksplus(View view)
    {
        a[4]=inc(a[4]);
        TextView tv=findViewById(R.id.countchickendrumstick);
        tv.setText(""+a[4]);
        sum=sum+1;
        c[4]=0;
        p[4]=1;
        cartTotal(sum);
    }

    public void chckenDsticksminus(View view)
    {
        a[4]=dec(a[4]);
        TextView tv=findViewById(R.id.countchickendrumstick);
        tv.setText(""+a[4]);
        if(sum!=0 && a[4]>0)
        {
            sum = sum - 1;
        }
        if(a[4]==0 && c[4]==0 && p[4]==1)
        {
            sum=sum-1;
            c[4]=1;
        }
        cartTotal(sum);
    }
    //end

    //Paneer Butter Masala
    public void paneerBMplus(View view)
    {
        a[5]=inc(a[5]);
        TextView tv=findViewById(R.id.countpaneerbm);
        tv.setText(""+a[5]);
        sum=sum+1;
        c[5]=0;
        p[5]=1;
        cartTotal(sum);
    }

    public void paneerBMminus(View view)
    {
        a[5]=dec(a[5]);
        TextView tv=findViewById(R.id.countpaneerbm);
        tv.setText(""+a[5]);
        if(sum!=0 && a[5]>0 && p[5]==1)
        {
            sum = sum - 1;
        }
        if(a[5]==0 && c[5]==0)
        {
            sum=sum-1;
            c[5]=1;
        }
        cartTotal(sum);
    }
    //end

    //Chicken Bharta
    public void chickenBhartaplus(View view)
    {
        a[6]=inc(a[6]);
        TextView tv=findViewById(R.id.countchickenbharta);
        tv.setText(""+a[6]);
        sum=sum+1;
        c[6]=0;
        p[6]=1;
        cartTotal(sum);
    }

    public void chickenBhartaminus(View view)
    {
        a[6]=dec(a[6]);
        TextView tv=findViewById(R.id.countchickenbharta);
        tv.setText(""+a[6]);
        if(sum!=0 && a[6]>0)
        {
            sum = sum - 1;
        }
        if(a[6]==0 && c[6]==0 && p[6]==1)
        {
            sum=sum-1;
            c[6]=1;
        }
        cartTotal(sum);
    }
    //end

    //Naan
    public void naanplus(View view)
    {
        a[7]=inc(a[7]);
        TextView tv=findViewById(R.id.countnaan);
        tv.setText(""+a[7]);
        sum=sum+1;
        c[7]=0;
        p[7]=1;
        cartTotal(sum);
    }
    public void naanminus(View view)
    {
        a[7]=dec(a[7]);
        TextView tv=findViewById(R.id.countnaan);
        tv.setText(""+a[7]);
        if(sum!=0 && a[7]>0)
        {
            sum = sum - 1;
        }
        if(a[7]==0 && c[7]==0 && p[7]==1)
        {
            sum=sum-1;
            c[7]=1;
        }
        cartTotal(sum);
    }

}