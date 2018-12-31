package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HeroesShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_show);
        int id = getIntent().getIntExtra("heroeid",0);

        final TextView tvhNombre = findViewById(R.id.etnombre);
        final TextView tvhRaza = findViewById(R.id.etraza);
        final TextView tvhDescripcion = findViewById(R.id.etdesc);
        final TextView tvhVida = findViewById(R.id.etvida);
        final TextView tvhFuerza = findViewById(R.id.etfuerza);
        final TextView tvhDefensa = findViewById(R.id.etdefensa);
        final TextView tvhEvasion = findViewById(R.id.etevasion);
        final TextView tvhAgilidad = findViewById(R.id.etagilidad);
        final TextView tvhMana = findViewById(R.id.etmana);
        final TextView tvhMagia = findViewById(R.id.etmagia);
        final TextView tvhinventario = findViewById(R.id.etinventario);
        final TextView tvhHabilidades = findViewById(R.id.ethabilidades);
        final HeroeViewModel heroeViewModel = ViewModelProviders.of(this).get(HeroeViewModel.class);
        heroeViewModel.getHeroe(id).observe(this, new Observer<Heroes>() {
            @Override
            public void onChanged(@Nullable Heroes heroes) {
                tvhNombre.setText(heroes.nombre);
                tvhRaza.setText(heroes.raza);
                tvhDescripcion.setText(heroes.descripcion);
                tvhFuerza.setText(heroes.fuerza);
                tvhDefensa.setText(heroes.defensa);
                tvhVida.setText(heroes.vida);
                tvhEvasion.setText(heroes.evasion);
                tvhAgilidad.setText(heroes.agilidad);
                tvhMana.setText(heroes.mana);
                tvhMagia.setText(heroes.magia);
                tvhinventario.setText(heroes.inventario);
                tvhHabilidades.setText(heroes.habilidades);
            }
        });
    }
}
