package com.example.vaibhav.hpapp;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    String planet[]={"MERCURY","VENUS","EARTH","MARS","JUPITOR"};
    void showToast(String msg)
    {
        Toast.makeText(SpinnerActivity.this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,planet);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                showToast("spinner"+planet[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                showToast("not selected planet");
            }
        });

    }

}
