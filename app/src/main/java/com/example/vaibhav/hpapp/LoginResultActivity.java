package com.example.vaibhav.hpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResultActivity extends AppCompatActivity {
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        textView1=(TextView)findViewById(R.id.textView2);
        Intent box=getIntent();
        String u=box.getStringExtra("U");
        String p=box.getStringExtra("P");
        textView1.setText("\nUsername: "+u);
        textView1.append("\nPassword: "+p);
        if(u.equals(p))
        {
            textView1.append("\nLogin Sucessfull");
        }
        else
        {
            textView1.append("\nLogin failed");
        }

    }
}
