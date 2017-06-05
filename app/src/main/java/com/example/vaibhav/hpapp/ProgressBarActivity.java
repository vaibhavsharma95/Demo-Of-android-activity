package com.example.vaibhav.hpapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class ProgressBarActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Thread thread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);
        thread=new Thread() // we are making an annonymus class which will inherit property of class thread and can be used by object thread
        {
            public void run()
            {
                for (int i=0;i<=100;i++)
                {
                    progressBar.setProgress(i);
                    try
                    {
                        Thread.sleep(50);
                    }
                    catch(Exception ex)
                    {

                    }
                }
                //Toast.makeText(ProgressBarActivity.this,"completed",Toast.LENGTH_LONG).show();
            }//end of method run
        };//end of annonimus class
    }
    public void startProgressBar(View v)
    {   thread.start();
    }
}
