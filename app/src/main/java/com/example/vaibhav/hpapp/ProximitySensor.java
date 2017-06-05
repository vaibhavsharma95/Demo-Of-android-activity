package com.example.vaibhav.hpapp;


import android.support.v7.app.ActionBarActivity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class ProximitySensor extends AppCompatActivity implements SensorEventListener
{
    ImageView imageView;
    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_sensor);

        imageView=(ImageView)findViewById(R.id.imageView);
        String sensorService = Context.SENSOR_SERVICE;
        sensorManager = (SensorManager)getSystemService(sensorService);
        int type = Sensor.TYPE_PROXIMITY;
        Sensor sensor = sensorManager.getDefaultSensor(type);
        sensorManager.registerListener(ProximitySensor.this,sensor, SensorManager.SENSOR_DELAY_NORMAL);

    }

    @Override
    public void onSensorChanged(SensorEvent event)
    {
        float f=event.values[0];
        Toast.makeText(ProximitySensor.this,"Sensor Value"+f,Toast.LENGTH_SHORT).show();
        if(f==0.0)
        {	imageView.setImageResource(R.color.colorAccent);
        }
        else
        {   imageView.setImageResource(R.color.colorPrimaryDark);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy)
    {
    }

    @Override
    protected void onStop() {
        super.onStop();
        sensorManager.unregisterListener(this);
    }
}
