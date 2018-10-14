package com.example.veda.task;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button stop, start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);

        start.setOnClickListener((View.OnClickListener) this);
       stop.setOnClickListener((View.OnClickListener) this);

       ///hi this is sai -----




    }

    @Override
    public void onClick(View view) {
        if (view == start) {

            startService(new Intent(this,newService.class));

        } else if (view == stop);

           stopService(new Intent(this,newService.class));
    }



}