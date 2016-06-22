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
public class JoseFabio extends Fragment {


    public JoseFabio(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstaceState){
        return inflater.inflate(R.layout.josefabio, container, false);
    }

}
