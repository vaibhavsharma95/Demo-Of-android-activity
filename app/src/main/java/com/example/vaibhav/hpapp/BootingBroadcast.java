package com.example.vaibhav.hpapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class BootingBroadcast extends BroadcastReceiver {
    public BootingBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        {   String str = intent.getAction();
            //Toast.makeText(context , "BroadcastReceiver got the message from OS", Toast.LENGTH_LONG).show();
            Toast.makeText(context , "Phone startup completed.", Toast.LENGTH_LONG).show();
        }
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
