package com.example.vaibhav.hpapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.widget.Toast;

public class PhoneBroadcast extends BroadcastReceiver {
    public PhoneBroadcast() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Bundle bundle=intent.getExtras();
        if(bundle!=null)
        {
            String state=bundle.getString("state");
            if(state.equals(TelephonyManager.EXTRA_STATE_RINGING))
            {
                String string="---Please pick up the call---";
                Toast.makeText(context,string,Toast.LENGTH_LONG).show();
            }
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
