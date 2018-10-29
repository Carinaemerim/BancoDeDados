package com.example.carinaemerim.bancodedados.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.carinaemerim.bancodedados.Entity.Anotacoes;

import java.util.List;

@Dao
public interface AnotacoesDAO {

    @Query("SELECT * FROM anotacoes")
    List<Anotacoes> getAll();

    @Query("SELECT * FROM anotacoes WHERE id IN (:anotacoesIds)")
    List<Anotacoes> loadAllByIds(int[] anotacoesIds);

    @Insert
    void insertAll(Anotacoes... anotacoes);

    @Delete
    void delete(Anotacoes anotacoes);

}
