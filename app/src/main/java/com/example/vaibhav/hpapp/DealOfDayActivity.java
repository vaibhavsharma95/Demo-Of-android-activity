package com.example.vaibhav.hpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class DealOfDayActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deal_of_day);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
    }

    public void deal(View v) {
        Intent intent = new Intent(DealOfDayActivity.this, DealConfirmationActivity.class);
        intent.putExtra("Q", editText1.getText().toString());
        intent.putExtra("P", editText2.getText().toString());
        startActivityForResult(intent, 7777);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String result =data.getStringExtra("msg");
        Toast.makeText(DealOfDayActivity.this,result,Toast.LENGTH_LONG).show();
    }
}
