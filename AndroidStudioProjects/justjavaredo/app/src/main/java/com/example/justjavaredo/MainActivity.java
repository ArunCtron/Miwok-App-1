package com.example.justjavaredo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int quantity=0;
    /**
     * This method displays the given text on the screen.
     */

    public String nameView()
    {
        EditText n=findViewById(R.id.name);
        String name=n.getText().toString();
        return name;
    }

    public boolean whippedCream()
    {
        CheckBox cb=findViewById(R.id.whippedCream);
        boolean val=cb.isChecked();
        return val;
    }

    public boolean chocolate()
    {
        CheckBox choco=findViewById(R.id.chocolate);
        boolean c=choco.isChecked();
        return c;
    }

    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    public String createOrderSummary(int price,boolean x,boolean choco,String name)
    {
        String a="Name: "+name+"\nAdd Whipped Cream? "+x+"\nAdd Chocolate? "+choco+"\nQuantity: "+quantity+"\nTotal: $"+price+"\nThank You!";
        return a;
    }

    public int calculatePrice()
    {
        int price=quantity*5;
        return price;
    }
    public void increment(View view)
    {
        quantity=quantity+1;
        displayQuantity(quantity);
    }

    public void decrement(View view)
    {
        quantity=quantity-1;
        if(quantity<=0)
            quantity=0;
        displayQuantity(quantity);
    }

    public void openEmail(String summary,String subject)
    {
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setType("*/*");
        i.putExtra(Intent.EXTRA_EMAIL,"2006245@kiit.ac.in");
        i.putExtra(Intent.EXTRA_SUBJECT,"subject");
        i.putExtra(Intent.EXTRA_TEXT,"summary");
        if(i.resolveActivity(getPackageManager())!=null)
        {
            startActivity(i);
        }

    }

    public void submitOrder(View view) {
        //display(quantity);
        //String priceMessage="Total $:"+calculatePrice()+"\nThank You!";
        //displayMessage(priceMessage);
        String name=nameView();
        int price=calculatePrice();
        boolean check=whippedCream();
        boolean choco=chocolate();
        if(check==true)
        {
            price=price+1;
        }
        if(choco==true)
        {
            price=price+2;
        }
        String x=createOrderSummary(price,check,choco,name);
        //displayMessage(x);
        openEmail(x,"This is just a test to see if intents work or not");
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


}