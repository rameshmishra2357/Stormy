package com.example.stormy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String apiKey ="6ca2f6fb20c5b668b07c84aa7eabeafa";
        double latitute =37.8267;
        double longtitute =-122.4233;
        String forcast ="https://api.darksky.net/forecast/"+apiKey+"/"+latitute+","+longtitute;
    }
}
