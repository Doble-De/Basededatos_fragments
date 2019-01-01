package com.dalealdado.pruebasfragments;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class EnemigoRecyclerAdapter extends RecyclerView.Adapter<EnemigoRecyclerAdapter.EnemigoViewHolder> {
    List<Enemigos> list;

    @Override
    public EnemigoViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemPersonaje = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_personaje, parent, false);
        return new EnemigoViewHolder(itemPersonaje);
    }

    @Override
    public void onBindViewHolder (final EnemigoViewHolder holder, int position) {
        final Enemigos enemigos = list.get(position);

        holder.enemigoNombre.setText(enemigos.nombre);
        holder.enemigoRaza.setText(enemigos.raza);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), EnemigosShowActivity.class);
                intent.putExtra("enemigoid", enemigos.id);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return (list !=null ? list.size() : 0);
    }

    public void setList(List<Enemigos> enemigos){
        this.list = enemigos;
    }

    class EnemigoViewHolder extends RecyclerView.ViewHolder{
        private TextView enemigoNombre;
        private TextView enemigoRaza;

        EnemigoViewHolder(View itemEnemigo){
            super(itemEnemigo);
            enemigoNombre = itemEnemigo.findViewById(R.id.nombre);
            enemigoRaza = itemEnemigo.findViewById(R.id.raza);
        }
    }
}
