package com.example.aguadascaldas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    ArrayList<ActividadTuristica> listaDeSitiosTuristicos=new ArrayList< >();
    RecyclerView listadoSitiosTuristicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listadoSitiosTuristicos=findViewById(R.id.listadoSitiosTuristicos);
        listadoSitiosTuristicos.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));
        crearSitiosTuristicos();

        AdaptadorAguadas adaptador =new AdaptadorAguadas(listaDeSitiosTuristicos);
        listadoSitiosTuristicos.setAdapter(adaptador);
    }

    private void crearSitiosTuristicos() {

        listaDeSitiosTuristicos.add(new ActividadTuristica(
                "FESTIVAL DEL PASILLO",
                "105 años",
                 getString(R.string.festival),
                 R.drawable.festival,
                 R.drawable.festival2,
                R.drawable.festival2
                ));

        listaDeSitiosTuristicos.add(new ActividadTuristica(
                "PARROQUIA SAN ANTONIO  ",
                "80 años",
                getString(R.string.parroquia),
                R.drawable.antonio,
                R.drawable.antonio1,
                R.drawable.antonio2));

        listaDeSitiosTuristicos.add(new ActividadTuristica(
                "PUEBLITO VIEJTO ",
                "90 años",
                getString(R.string.pueblito),
                R.drawable.pueblito,
                R.drawable.pueblito1,
                R.drawable.pueblito2));






    }

}

