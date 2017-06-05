package com.example.vaibhav.hpapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText1=(EditText)findViewById(R.id.editText1);
        editText2=(EditText)findViewById(R.id.editText2);
        textView3=(TextView)findViewById(R.id.textView3);
    }
    public void calc(View V)
    {
        String s1=editText1.getText().toString();
        String s2=editText2.getText().toString();
        int len1=s1.length();
        int len2=s2.length();
        int result=len1+len2;
        result=result%11;
        result=result*10;
        textView3.setText("Your %: "+result);
    }
}
