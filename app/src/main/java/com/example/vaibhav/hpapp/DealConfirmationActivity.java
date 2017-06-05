package com.example.vaibhav.hpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DealConfirmationActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    String answer="Unanswered";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_confirmation);
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        textView1.setText("Quantity of product: " + intent.getStringExtra("Q"));
        textView2.setText("Per unit price: " + intent.getStringExtra("P"));
    }
    public void DealStatus(View V)
    {
        int bid=V.getId();
        switch (bid)
        {
            case R.id.button1: answer="Confirm Deal";
                break;
            case R.id.button2: answer="Cancel Deal";
        }
        Intent intent = new Intent();
        intent.putExtra("msg",answer);
        setResult(999,intent);
        finish();
    }
}
