package com.example.vaibhav.hpapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MusicService extends Service implements MediaPlayer.OnCompletionListener {
    MediaPlayer mediaPlayer;
    public MusicService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mediaPlayer=MediaPlayer.create(this,R.raw.reality);
        mediaPlayer.setOnCompletionListener(this);
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        if( mediaPlayer.isPlaying() == false)
        {   mediaPlayer.start();
            Toast.makeText(this, "Music Play started", Toast.LENGTH_LONG).show();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if( mediaPlayer.isPlaying() == true)
        {   mediaPlayer.stop();
            Toast.makeText(this, "Music Play stoped", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onCompletion(MediaPlayer mp) {
        stopSelf();

    }
}
