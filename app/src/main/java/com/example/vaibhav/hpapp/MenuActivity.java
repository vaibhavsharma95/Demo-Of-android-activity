package com.example.vaibhav.hpapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MenuActivity extends ListActivity
{
    String screen[]={"MainActivity","CalculatorActivity","LoginActivity","CameraActivity","DynamicListActivity","PhoneActivity","SpinnerActivity","RadioActivity","DealOfDayActivity","AlertDialogActivity","MyOptionMenu","ProgressBarActivity","SeekBarActivity","Database","ProximitySensor","OrientationSensor","GPS","ServiceDemoActivity","MusicActivity","SCREEN1","EXIT"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_menu);
        //we are deleting this because it is used to display graphic from xml file but here we are using graphic of android os
        ArrayAdapter adapter=new ArrayAdapter(MenuActivity.this, android.R.layout.simple_list_item_1,screen);
        //array adapter is a function like plastic bag used to carry all item in it
        setListAdapter(adapter);
        //it is used to display all graphic from adapter
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        //Toast.makeText(MenuActivity.this, screen[position],Toast.LENGTH_SHORT).show();
        if(screen[position].equals("EXIT"))
        {
            finish();
        }
        else
        {
            String string=screen[position];
            string="com.example.vaibhav.hpapp"+"."+string;
          //  string="com/example/vaibhav/hpapp/LoginActivity";
            try
            {
                Class c = Class.forName(string);
                Intent intent=new Intent(this,c);
                startActivity(intent);
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
                Toast.makeText(this,"Screen has not yet designed",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
