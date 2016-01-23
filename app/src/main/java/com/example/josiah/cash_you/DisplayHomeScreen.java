package com.example.josiah.cash_you;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;


public class DisplayHomeScreen extends ActionBarActivity {

    Intent intent = getIntent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_home_screen);
    }

}
