package com.example.listamascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PetAdapter extends RecyclerView.Adapter<PetAdapter.PetViewHolder> {
    private List<Pet> items;
    public static class PetViewHolder extends RecyclerView.ViewHolder {
        //private static final android.R.attr R = new android.R.attr();
        // Campos respectivos de un item
        public ImageView imagen;
        public TextView nombre;
        public TextView favorito;

        public PetViewHolder(View v) {
            super(v);
            imagen = (ImageView) v.findViewById(R.id.img);
            nombre = (TextView) v.findViewById(R.id.tvNombre);
            favorito = (TextView) v.findViewById(R.id.tvRating);
        }
    }
    public PetAdapter(List<Pet> items) {
        this.items = items;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public PetViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.cardview, viewGroup, false);
        return new PetViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetViewHolder viewHolder, int i) {
        viewHolder.imagen.setImageResource(items.get(i).getImagen());
        viewHolder.nombre.setText(items.get(i).getNombre());
        viewHolder.favorito.setText(String.valueOf(items.get(i).getFavorito()));
    }
}
