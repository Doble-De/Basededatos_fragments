package com.dalealdado.pruebasfragments;

import android.arch.lifecycle.LiveData;

import java.util.List;

public class HeroesListFragment extends HeroeListFragment {
    @Override
    LiveData<List<Heroes>> getHeroes() {
        return heroeViewModel.getAllHeroes();
    }
}
