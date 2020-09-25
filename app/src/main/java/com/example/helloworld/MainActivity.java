package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate : Called");
        Log.i(TAG, "onCreate : Called 2");
        Log.i(TAG, "onCreate : Called 3");
        setContentView(R.layout.activity_main);
    }
}