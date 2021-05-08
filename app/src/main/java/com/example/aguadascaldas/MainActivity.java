package com.example.aguadascaldas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView nombreSitioTuristico, descripcionSitioTuristico;
    ImageView fotoSitioTuristico, fotoSitioTuristico2, fotoSitioTuristico3;

    ActividadTuristica aguadas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreSitioTuristico=findViewById(R.id.nombreSitioTuristico);
        descripcionSitioTuristico=findViewById(R.id.descripcionSitioTuristico);
        fotoSitioTuristico=findViewById(R.id.fotoSitioTuristico);
        fotoSitioTuristico2=findViewById(R.id.fotoSitioTuristico2);
        fotoSitioTuristico3=findViewById(R.id.fotoSitioTuristico3);

        aguadas=(ActividadTuristica) getIntent().getSerializableExtra("sitiosTuristicos");

        nombreSitioTuristico.setText(aguadas.getNombreSitioTuristico());
        descripcionSitioTuristico.setText(aguadas.getDescripcionSitioTuristico());
        fotoSitioTuristico.setImageResource(aguadas.getFotoSitioTuristico());
        fotoSitioTuristico2.setImageResource(aguadas.getFotoSitioTuristico2());
        fotoSitioTuristico3.setImageResource(aguadas.getFotoSitioTuristico3());

    }
}