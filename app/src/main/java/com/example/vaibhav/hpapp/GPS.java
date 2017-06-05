package com.example.vaibhav.hpapp;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.provider.ContactsContract;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class GPS extends AppCompatActivity {
    TextView textView2;
    LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gps);
        textView2 = (TextView) findViewById(R.id.textView2);
        locationManager = (LocationManager)getSystemService(Context.LOCATION_SERVICE);
       MyLocationListener locationListener = new MyLocationListener();
       locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

    }
}
class MyLocationListener extends GPS implements LocationListener
{
    @Override
    public void onLocationChanged(Location location)
    {
        String text = "My Current location is: \n Latitude: "+location.getLatitude()+"\nLongitude: "+location.getLongitude();
        textView2.setText(text);
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider)
    {
        Toast.makeText(getApplicationContext(), "GPS Enabled by Vaibhav", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderDisabled(String provider)
    {
        Toast.makeText(getApplicationContext(), "GPS Disabled by Vaibhav", Toast.LENGTH_SHORT).show();

    }

}