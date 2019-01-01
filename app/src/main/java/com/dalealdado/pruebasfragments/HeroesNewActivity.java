package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class HeroesNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heroes_new);

        final HeroeViewModel heroeViewModel = ViewModelProviders.of(this).get(HeroeViewModel.class);
        findViewById(R.id.guardar).setOnClickListener(new View.OnClickListener() {

            EditText Hnombre = findViewById(R.id.etnombre);
            EditText Hraza = findViewById(R.id.etraza);
            EditText Hdesc = findViewById(R.id.etdesc);
            EditText Hvida = findViewById(R.id.etvida);
            EditText Hfuerza = findViewById(R.id.etfuerza);
            EditText Hdefensa = findViewById(R.id.etdefensa);
            EditText Hevasion = findViewById(R.id.etevasion);
            EditText Hagilidad = findViewById(R.id.etagilidad);
            EditText Hmana = findViewById(R.id.etEmana);
            EditText Hmagia = findViewById(R.id.etmagia);
            EditText Hhabilidades = findViewById(R.id.ethabilidades);
            EditText Hinventario = findViewById(R.id.etinventario);

            @Override
            public void onClick(View v) {

                Heroes heroes = new Heroes();

                heroes.nombre = Hnombre.getText().toString();
                heroes.raza = Hraza.getText().toString();
                heroes.descripcion = Hdesc.getText().toString();
                heroes.vida = Hvida.getText().toString();
                heroes.fuerza = Hfuerza.getText().toString();
                heroes.defensa = Hdefensa.getText().toString();
                heroes.evasion = Hevasion.getText().toString();
                heroes.agilidad = Hagilidad.getText().toString();
                heroes.mana = Hmana.getText().toString();
                heroes.magia = Hmagia.getText().toString();
                heroes.habilidades = Hhabilidades.getText().toString();
                heroes.inventario = Hinventario.getText().toString();

                heroeViewModel.insertHeroe(heroes);
                finish();

            }
        });
    }
}
