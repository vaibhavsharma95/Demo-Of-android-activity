package com.example.vaibhav.hpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MyOptionMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_option_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.my_option_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        switch(id)
        {
            case R.id.item1:
                Toast.makeText(MyOptionMenu.this,"Add New",Toast.LENGTH_LONG).show();
                break;
            case R.id.item2:
                Toast.makeText(MyOptionMenu.this,"View All",Toast.LENGTH_LONG).show();
                break;
            case R.id.item3:
                Toast.makeText(MyOptionMenu.this,"Update",Toast.LENGTH_LONG).show();
                break;
            case R.id.item4:
                Toast.makeText(MyOptionMenu.this,"Setting",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
