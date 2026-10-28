package com.example.laba6part2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BikeSecondFragment extends Fragment {
    public BikeSecondFragment() { super(R.layout.fragment_bike_second); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bike_second, container, false);

        view.findViewById(R.id.btn_to_third).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_bikeSecondFragment_to_bikeThirdFragment);
        });

        return view;
    }
}