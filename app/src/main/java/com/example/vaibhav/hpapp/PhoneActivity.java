package com.example.vaibhav.hpapp;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PhoneActivity extends ListActivity
{

    String scrArray[]={"PHONE CALL","SMS","WEB","WEBSEARCH","PHONEBOOK","EXIT"};
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_phone);
        ArrayAdapter adapter = new ArrayAdapter(PhoneActivity.this, android.R.layout.simple_list_item_1, scrArray);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id)
    {
        super.onListItemClick(l, v, position, id);
        if(scrArray[position].equals("EXIT"))
        {
            finish();
        }
        else if (scrArray[position].equals("PHONE CALL"))
        {
            Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9598555608"));
            startActivity(i);
        }
        else if(scrArray[position].equals("SMS"))
        {
            Intent i=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:9598555608"));
            i.putExtra("sms_body","Hellow");
            startActivity(i);
        }
        else if (scrArray[position].equals("WEB"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
            startActivity(i);
        }
        else if (scrArray[position].equals("WEBSEARCH"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.google.com"));
            i.putExtra(SearchManager.QUERY,"Indian railway");
            startActivity(i);
        }
        else if(scrArray[position].equals("PHONEBOOK"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts/people/"));
            startActivity(i);
        }
        else if(scrArray[position].equals("MAPSEARCH"))
        {
            Intent i=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:VARANASI"));
            startActivity(i);
        }
    }
}

