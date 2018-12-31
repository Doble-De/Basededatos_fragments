package com.dalealdado.pruebasfragments;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

public class EnemigoViewModel extends AndroidViewModel {

    private DADRepositoryEnemigo mEnemigo;

    public EnemigoViewModel(Application application){
        super(application);
        mEnemigo = new DADRepositoryEnemigo(application);
    }

    LiveData<List<Enemigos>> getAllEnemigos(){return mEnemigo.getAllEnemigos();}

    LiveData<Enemigos> getEnemigos(int id){ return mEnemigo.getEnemigo(id);}

    public void insertEnemigo(Enemigos enemigos) { mEnemigo.insert(enemigos);}
}
