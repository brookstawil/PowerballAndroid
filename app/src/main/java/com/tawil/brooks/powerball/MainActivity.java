package com.tawil.brooks.powerball;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.start: {
                Intent intent = new Intent(this,Simulation.class);
                startActivity(intent);
                break;
            }
            case R.id.settings: {
                Intent intent = new Intent(this,SettingsActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.rules:{
                //Intent intent = new Intent(this,)
                //startActivity();
                break;
            }
        }
    }
}
