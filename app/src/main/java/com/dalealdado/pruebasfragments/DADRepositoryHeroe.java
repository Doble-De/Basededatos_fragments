package com.dalealdado.pruebasfragments;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import java.util.List;

public class DADRepositoryHeroe {

    private DAO mdao;

    DADRepositoryHeroe(Application application){
        mdao = DADDatabase.getDatabase(application).DAO();
    }

    LiveData<List<Heroes>> getAllHeroes(){
        return mdao.getAllHeroes();
    }


    LiveData<Heroes> getHeroe(int id){ return mdao.getHeroe(id); }

    public void insert(Heroes heroes){
        new InsertAsyncTask(mdao).execute(heroes);
    }


    private static class InsertAsyncTask extends AsyncTask<Heroes, Void, Void> {

        private DAO mAsyncTaskDao;

        InsertAsyncTask(DAO dao){
            mAsyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Heroes... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }


}
