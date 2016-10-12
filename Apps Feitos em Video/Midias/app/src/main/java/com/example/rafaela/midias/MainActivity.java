package com.example.rafaela.midias;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp = null;
    private void pararAudio(){
        if (mp!=null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void audio1(View v) {
        pararAudio();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.audio_1);
        mp.start();


    }

    public void audio2(View v) {
        pararAudio();
        mp = MediaPlayer.create(getApplicationContext(), R.raw.audio_2);
        mp.start();

    }

}
