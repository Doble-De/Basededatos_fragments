package com.dalealdado.pruebasfragments;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class HeroeViewModel extends AndroidViewModel {

    private DADRepositoryHeroe mHeroe;

    public HeroeViewModel(Application application){
        super(application);
        mHeroe = new DADRepositoryHeroe(application);
    }

    LiveData<List<Heroes>> getAllHeroes(){return mHeroe.getAllHeroes();}

    LiveData<Heroes> getHeroe(int id){ return mHeroe.getHeroe(id);}

    public void insertHeroe(Heroes heroes) { mHeroe.insert(heroes);}

}
