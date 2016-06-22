package com.example.josefabioal.listaspersonas;

import android.app.ListActivity;
import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.josefabioal.listaspersonas.Fragments.list;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listViewPersonas;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        FragmentManager fmanager = getSupportFragmentManager();
        FragmentTransaction ftransaction = fmanager.beginTransaction();


        //Cambiar de fragment segun esté acostado o parado el celular
        Configuration c = getResources().getConfiguration();

        if(c.orientation == Configuration.ORIENTATION_PORTRAIT){//si esta parado se mostrará la lista de personas

            //Agregar personas al listView
            listViewPersonas = (ListView) findViewById(R.id.listViewPersonas);

            ArrayList<String> Personas = new ArrayList<String>();

            Personas.add("Jose Fabio");
            Personas.add("Isrrael");

            adaptador = new ArrayAdapter<String>(this,
                    android.R.layout.simple_list_item_1, Personas);listViewPersonas.setAdapter(adaptador);

            ftransaction.replace(android.R.id.content, new list());
        }

        ftransaction.replace(android.R.id.content, new list());
        ftransaction.commit();
    }
}
