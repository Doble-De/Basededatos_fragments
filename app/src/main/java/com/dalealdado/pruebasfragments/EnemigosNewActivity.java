package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.chrono.Era;

public class EnemigosNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemigos_new);

        final EnemigoViewModel enemigoViewModel = ViewModelProviders.of(this).get(EnemigoViewModel.class);
        findViewById(R.id.guardar).setOnClickListener(new View.OnClickListener() {

            EditText Enombre = findViewById(R.id.etEnombre);
            EditText Eraza = findViewById(R.id.etEraza);
            EditText Edesc = findViewById(R.id.etEdesc);
            EditText Evida = findViewById(R.id.etEvida);
            EditText Efuerza = findViewById(R.id.etEfuerza);
            EditText Edefensa = findViewById(R.id.etEdefensa);
            EditText Eevasion = findViewById(R.id.etEevasion);
            EditText Eagilidad = findViewById(R.id.etEagilidad);
            EditText Emana = findViewById(R.id.etEmana);
            EditText Emagia = findViewById(R.id.etEmagia);
            EditText Ehabilidades = findViewById(R.id.etEhabilidades);
            EditText Edrop = findViewById(R.id.etdrop);

            @Override
            public void onClick(View v) {

                Enemigos enemigos = new Enemigos();

                enemigos.nombre = Enombre.getText().toString();
                enemigos.raza = Eraza.getText().toString();
                enemigos.descripcion = Edesc.getText().toString();
                enemigos.vida = Evida.getText().toString();
                enemigos.fuerza = Efuerza.getText().toString();
                enemigos.defensa = Edefensa.getText().toString();
                enemigos.evasion = Eevasion.getText().toString();
                enemigos.agilidad = Eagilidad.getText().toString();
                enemigos.mana = Emana.getText().toString();
                enemigos.magia = Emagia.getText().toString();
                enemigos.habilidades = Ehabilidades.getText().toString();
                enemigos.drop = Edrop.getText().toString();

                enemigoViewModel.insertEnemigo(enemigos);
                finish();
            }
        });
    }
}
