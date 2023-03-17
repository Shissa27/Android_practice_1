package com.example.practica_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.practica_1.databinding.FragmentSecBinding;
import com.example.practica_1.databinding.FragmentSecondBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FragmentSec extends Fragment {

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        FragmentSecBinding binding = FragmentSecBinding.inflate(getLayoutInflater());
        final Random random = new Random();
        List<String> Stars =new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            int num = random.nextInt(700);
            Stars.add("Звезда bqwe_" + (i+1));
        }
        Log.i("PUDGE",Stars.size()+"A");
        CustomViewListAdapter viewListAdapter = new CustomViewListAdapter(binding.getRoot().getContext(),R.layout.vlist_orig,Stars);
        binding.vlist2.setAdapter(viewListAdapter);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_sec, container, false);
    }
}