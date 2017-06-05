package com.example.vaibhav.hpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
    }
    public void show(View V)
    {
        String s1=editText1.getText().toString();
        String s2=editText2.getText().toString();
        Intent box=new Intent(LoginActivity.this,LoginResultActivity.class);
        box.putExtra("U",s1);
        box.putExtra("P",s2);
        startActivity(box);
    }
}
