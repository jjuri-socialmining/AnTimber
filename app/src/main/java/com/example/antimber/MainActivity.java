package com.example.antimber;

import static timber.log.Timber.*;
import static timber.log.Timber.DebugTree;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import timber.log.Timber;
import timber.log.Timber.DebugTree;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree());
        e("Changed to onBackground");
    }
}