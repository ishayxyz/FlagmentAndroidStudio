package com.example.myflagment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragment_station#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragment_station extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_station, container, false);
    }
}