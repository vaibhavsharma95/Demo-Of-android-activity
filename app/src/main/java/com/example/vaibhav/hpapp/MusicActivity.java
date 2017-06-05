package com.example.vaibhav.hpapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MusicActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        intent=new Intent(MusicActivity.this,MusicService.class);
    }
    public void button1(View V)
    {
        startService(intent);
    }
    public void button2(View V)
    {
        stopService(intent);
    }
}
