package com.gleamsoft.developer.yac.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gleamsoft.developer.yac.R;

public class ThemesActivity extends AppCompatActivity {

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_themes);
    Intent in = getIntent();
    String nombreSitio  = in.getStringExtra("area");
    setTitle(nombreSitio);
    android.support.v7.app.ActionBar actionBar=getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
}
}
