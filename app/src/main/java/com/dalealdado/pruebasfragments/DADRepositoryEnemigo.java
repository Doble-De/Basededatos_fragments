package com.dalealdado.pruebasfragments;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class DADRepositoryEnemigo {

    private DAO mdao;

    DADRepositoryEnemigo(Application application){
        mdao = DADDatabase.getDatabase(application).DAO();
    }

    LiveData<List<Enemigos>> getAllEnemigos(){
        return mdao.getAllEnemigos();
    }


    LiveData<Enemigos> getEnemigo(int id){ return mdao.getEnemigo(id); }

    public void insert(Enemigos enemigos){
        new DADRepositoryEnemigo.InsertAsyncTask(mdao).execute(enemigos);
    }


    private static class InsertAsyncTask extends AsyncTask<Enemigos, Void, Void> {

        private DAO mAsyncTaskDao;

        InsertAsyncTask(DAO dao){
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Enemigos... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
