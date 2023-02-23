package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";//Тег - метка для сообщения
    int duration = Toast.LENGTH_SHORT;
    Context context = MainActivity.this;//Тут происходит ошибка если использовать getApplicationContext() вне методов
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linar_test);
        Toast toast = Toast.makeText(MainActivity.this, "Toast_onCreate", duration);
        toast.show();
        Log.i(TAG,"Toast_onCrate_is_showed");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast toast = Toast.makeText(context, "Toast_onStart", duration);
        toast.show();
        Log.e(TAG,"Toast_onStart_is_showed");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast toast = Toast.makeText(context, "Toast_onStop", duration);
        toast.show();
        Log.w(TAG,"Toast_onStop_is_showed");
    }
    @Override
    protected void onDestroy() {
        Toast toast = Toast.makeText(context, "Toast_onDestroy", duration);
        toast.show();
        Log.d(TAG,"Toast_onDestroy_is_showed");
        super.onDestroy();

    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast toast = Toast.makeText(context, "Toast_onPause", duration);
        toast.show();
        Log.v(TAG,"Toast_onPause_is_showed");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast toast = Toast.makeText(context, "Toast_onResume", duration);
        toast.show();
        Log.wtf(TAG,"Toast_onResume_is_showed");
    }
}