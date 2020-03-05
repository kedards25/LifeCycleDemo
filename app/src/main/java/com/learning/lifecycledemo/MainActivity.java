package com.learning.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="This Activity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Activity Created");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Activity started");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Activity stopped");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Activity Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"Activity Resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Activity Destroyed");
    }
}
