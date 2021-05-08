package com.example.aguadascaldas;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorAguadas  extends RecyclerView.Adapter<AdaptadorAguadas.viewHolder>{

    ArrayList<ActividadTuristica> listaDeSitiosTuristicos;

    public AdaptadorAguadas(ArrayList <ActividadTuristica> listaDeSitiosTuristicos) {
        this.listaDeSitiosTuristicos = listaDeSitiosTuristicos;
    }

    @NonNull
    @Override
    public AdaptadorAguadas.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaSitiosTuristicos= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sitios_turisticos,null,false);
        return new viewHolder(vistaSitiosTuristicos);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorAguadas.viewHolder holder, int position) {
        holder.actualizarSitiosTuristicos(listaDeSitiosTuristicos.get(position)); //llamando un metodo o funcion que se llama actualizardatos
    }

    @Override
    public int getItemCount() {
        return listaDeSitiosTuristicos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView nombreActividadTuristica, antiguedadSitioTuristico, descripcionSitioTuristico;
        ImageView fotoActividadTuristica, fotoActividadTuristica2, fotoActividadTuristica3;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            nombreActividadTuristica=itemView.findViewById(R.id.nombreSitioTuristico);
            antiguedadSitioTuristico=itemView.findViewById(R.id.antiguedadSitioTuristico);
            descripcionSitioTuristico=itemView.findViewById(R.id.descripcionSitioTuristico);
            fotoActividadTuristica=itemView.findViewById(R.id.fotoSitioTuristico);
            fotoActividadTuristica2=itemView.findViewById(R.id.fotoSitioTuristico2);
            fotoActividadTuristica3=itemView.findViewById(R.id.fotoSitioTuristico3);

        }

        public void actualizarSitiosTuristicos(ActividadTuristica datos) {
            nombreActividadTuristica.setText(datos.getNombreSitioTuristico());
            antiguedadSitioTuristico.setText(datos.getAntiguedadSitioTuristico());
            descripcionSitioTuristico.setText(datos.getDescripcionSitioTuristico());
            fotoActividadTuristica.setImageResource(datos.getFotoSitioTuristico());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(itemView.getContext(), MainActivity.class);
                   intent.putExtra("sitiosTuristicos", datos);
                   itemView.getContext().startActivity(intent);

                }
            });


        }


    }
}




