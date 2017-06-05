package com.example.vaibhav.hpapp;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Database extends AppCompatActivity
{   TableLayout tl;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        tl = (TableLayout)findViewById(R.id.tableLayout1);

        SQLiteDatabase db = openOrCreateDatabase("DemoDB", MODE_APPEND, null);
        db.execSQL("create  table if not exists Student (name varchar, phone varchar)");

        SharedPreferences sp = getSharedPreferences("DemoDB_file",0); //0=MODE_PRIVATE
        String msg = sp.getString("STATUS", "Not Initialized");
        if(msg.equals("Not Initialized"))
        {
            db.execSQL("insert into Student values('Vaibhav','9598555608')");
            db.execSQL("insert into Student values('Sania','7878787878')");
            db.execSQL("insert into Student values('Dhoni','6767867678')");
            db.execSQL("insert into Student values('Obama','4567456767')");
            Toast.makeText(this, "TABLE CREATED & Record Inserted.", Toast.LENGTH_LONG).show();
            SharedPreferences.Editor editor = sp.edit();
            editor.putString("STATUS", "Initialized");
            editor.commit();
        }
        else
        {   Toast.makeText(this, "TABLE already exists with 4 records", Toast.LENGTH_LONG).show();
        }

        //-----------------------------------------

        String n = "Katrina";
        db.execSQL("delete from Student where name ='" + n + "'  ");
        Toast.makeText(this,"Record Deleted. Successfully.",Toast.LENGTH_LONG).show();


        db.execSQL("update Student set phone='1111122222' where name='Obama'");
        Toast.makeText(this,"Record Updated Successfully.",Toast.LENGTH_LONG).show();

        TableLayout tl = (TableLayout)findViewById(R.id.tableLayout1);
        TableRow tr;
        String q = "select * from Student";
        Cursor c =db.rawQuery(q, null);
        String name,phone;
        while(c.moveToNext())
        {
            name = c.getString(0);
            phone = c.getString(1);
            tr = new TableRow(this);
            TextView tv1 = new TextView(this);
            tv1.setText(name);
            TextView tv2 = new TextView(this);
            tv2.setText(phone);
            tr.addView(tv1);
            tr.addView(tv2);
            tl.addView(tr);
        }//end of while loop
        db.close();
        Toast.makeText(this, "Data loaded!!!", Toast.LENGTH_LONG).show();
    }//end of onCreate()
}