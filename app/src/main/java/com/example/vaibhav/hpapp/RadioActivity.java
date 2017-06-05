package com.example.vaibhav.hpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioActivity extends AppCompatActivity
{
    RadioGroup rg;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        rg=(RadioGroup)findViewById(R.id.radioGroup1);
        textView =(TextView)findViewById(R.id.textView2);
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                String str="You have selected";
                switch (checkedId)
                {
                    case R.id.radioButton1:str=str+": Breakfast";
                        break;
                    case R.id.radioButton2:str=str+": Lunch";
                        break;
                    case R.id.radioButton3:str=str+": Dinner";
                        break;
                    case R.id.radioButton4:str=str+": All";
                        break;
                }
                textView.setText(str);
            }
        });
    }
    public void cleargroup(View V)
    {
        rg.clearCheck();
        textView.setText("You have selceted: none");
    }
}
