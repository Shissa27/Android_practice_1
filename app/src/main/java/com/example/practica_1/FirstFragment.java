package com.example.practica_1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practica_1.databinding.FragmentFirstBinding;


public class FirstFragment extends Fragment {
    String TAG = "Fragment 1";
    Button goFind,goInfo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        FragmentFirstBinding binding = FragmentFirstBinding.inflate(getLayoutInflater());
        goFind = binding.getLocationFirstFragment;
        goInfo = binding.getInfo;
        FragmentManager fragmentManager = getParentFragmentManager();
        goFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"BTN1");
                FragmentTransaction fragmentTransaction;
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame,new SecondFragment());
                fragmentTransaction.commit();
            }
        });
        goInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i(TAG,"BTN2");
                FragmentTransaction fragmentTransaction;
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame,new ThirdFragment());
                fragmentTransaction.commit();
            }
        });
        return binding.getRoot();
    }


}