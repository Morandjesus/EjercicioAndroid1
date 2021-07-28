package com.example.prueba1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Ejercicio_1_recycler extends RecyclerView.Adapter<Ejercicio_1_recycler.ViewHolderDatos> {

    //Para mostrar los números creo un array sencillito:
    ArrayList<String> ListarNumeros;
    //Su constructor:
    public Ejercicio_1_recycler(ArrayList<String> listarNumeros) {
        ListarNumeros = listarNumeros;
    }

    //LA función de onCreateViewHolder es enlazar la clase Ejercicio_1_recycler
    // con el xml que he creado para inicializar ViewHolder:
    @Override
    public ViewHolderDatos onCreateViewHolder(ViewGroup parent, int viewType) {
        View ver = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,null,false);
        return new ViewHolderDatos(ver);
    }
    //Esta función Devolverá el tamaño de la lista de ListarNumeros:
    @Override
    public int getItemCount() {
        return ListarNumeros.size();
    }

    // onBindViewHolder une ViewHolderDatos con la clase:
    @Override
    public void onBindViewHolder(Ejercicio_1_recycler.ViewHolderDatos holder, int position) {
        holder.AsignarDatos(ListarNumeros.get(position));
    }

    public class ViewHolderDatos extends RecyclerView.ViewHolder {
        //Hago la llamada al id del xml:
        TextView dato;
        public ViewHolderDatos(View itemView) {
            super(itemView);
            //Hago la referencia del id con el parámetro itemView:
            dato = (TextView) itemView.findViewById(R.id.idDato);
            //Lo que he hecho en la anterior sentencia es instanciar el TextView seleccionando por el id

        }

        public void AsignarDatos(String datos) {
            dato.setText(datos);
        }
    }
}

