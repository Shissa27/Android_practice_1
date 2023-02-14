package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int duration = Toast.LENGTH_SHORT;
    Context context = MainActivity.this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast toast = Toast.makeText(context, "Toast_onCreate", duration);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(context, "Toast_onStart", duration);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(context, "Toast_onStop", duration);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast toast = Toast.makeText(context, "Toast_onDestroy", duration);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(context, "Toast_onPause", duration);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(context, "Toast_onResume", duration);
        toast.show();
    }
}