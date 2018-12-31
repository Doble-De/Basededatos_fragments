package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class EnemigosListFragments extends EnemigoListFragment {
    @Override
    LiveData<List<Enemigos>> getEnemigos() {
        return enemigoViewModel.getAllEnemigos();
    }
}
