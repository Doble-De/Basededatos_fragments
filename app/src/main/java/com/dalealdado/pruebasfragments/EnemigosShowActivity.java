package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class EnemigosShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemigos_show);

        int id = getIntent().getIntExtra("enemigoid",0);

        final TextView tveNombre = findViewById(R.id.etEnombre);
        final TextView tveRaza = findViewById(R.id.etEraza);
        final TextView tveDescripcion = findViewById(R.id.etEdesc);
        final TextView tveVida = findViewById(R.id.etEvida);
        final TextView tveFuerza = findViewById(R.id.etEfuerza);
        final TextView tveDefensa = findViewById(R.id.etEdefensa);
        final TextView tveEvasion = findViewById(R.id.etEevasion);
        final TextView tveAgilidad = findViewById(R.id.etEagilidad);
        final TextView tveMana = findViewById(R.id.etEmana);
        final TextView tveMagia = findViewById(R.id.etEmagia);
        final TextView tveDrop = findViewById(R.id.etdrop);
        final TextView tveHabilidades = findViewById(R.id.etEhabilidades);
        final EnemigoViewModel enemigoViewModel = ViewModelProviders.of(this).get(EnemigoViewModel.class);
        enemigoViewModel.getEnemigos(id).observe(this, new Observer<Enemigos>() {
            @Override
            public void onChanged(@Nullable Enemigos enemigos) {
                tveNombre.setText(enemigos.nombre);
                tveRaza.setText(enemigos.raza);
                tveDescripcion.setText(enemigos.descripcion);
                tveFuerza.setText(enemigos.fuerza);
                tveDefensa.setText(enemigos.defensa);
                tveVida.setText(enemigos.vida);
                tveEvasion.setText(enemigos.evasion);
                tveAgilidad.setText(enemigos.agilidad);
                tveMana.setText(enemigos.mana);
                tveMagia.setText(enemigos.magia);
                tveDrop.setText(enemigos.drop);
                tveHabilidades.setText(enemigos.habilidades);
            }
        });

    }
}
