package com.example.practica_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.practica_1.databinding.ActivityMainBinding;
import com.example.practica_1.databinding.NewmainlayoutBinding;
import com.example.practica_1.databinding.RelativeTestBinding;
import com.example.practica_1.databinding.ViewBinding;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myLogs";//Тег - метка для сообщения
    int duration = Toast.LENGTH_SHORT;
    Button button_map, button_info, button_location;
    FrameLayout frameLayout;
    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newmainlayout);
        button_info = findViewById(R.id.get_info_fragment);
        button_location = findViewById(R.id.get_location_fragment);
        button_map = findViewById(R.id.get_map_fragment);
        FirstFragment firstFragment = new FirstFragment();
        replaceFragment(firstFragment);
        button_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"BTN_MAP");
                SecondFragment secondFragment = new SecondFragment();
                replaceFragment(secondFragment);
            }
        });
        button_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"BTN_LOC");
                replaceFragment(firstFragment);
            }
        });
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"BTN_INFO");
            }
        });
    }

}