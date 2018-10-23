package com.example.carinaemerim.bancodedados.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

public interface AnotacoesDAO {

    @Dao
    public interface AnotacoesDao {

        @Query("SELECT * FROM anotacoes")
        List<AnotacoesDAO> getAll();

        @Query("SELECT * FROM anotacoes WHERE id IN (:anotacoesIds)")
        List<AnotacoesDAO> loadAllByIds(int[] anotacoesIds);

        @Insert
        void insertAll(AnotacoesDAO... anotacoes);

        @Delete
        void delete(AnotacoesDAO anotacoes);
    }

}
