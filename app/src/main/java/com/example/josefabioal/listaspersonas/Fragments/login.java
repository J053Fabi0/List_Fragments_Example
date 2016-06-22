package com.example.josefabioal.listaspersonas.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.josefabioal.listaspersonas.R;

/**
 * Created by JoseFabioAL on 21/06/16.
 */
public class login extends Fragment {


    public login(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.login, container, false);
    }

}
