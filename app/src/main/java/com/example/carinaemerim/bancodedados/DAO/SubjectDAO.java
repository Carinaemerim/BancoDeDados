package com.example.carinaemerim.bancodedados.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.carinaemerim.bancodedados.Entity.Anotacoes;
import com.example.carinaemerim.bancodedados.Entity.Subject;

import java.util.List;

@Dao
public interface SubjectDAO {

    @Query("SELECT * FROM subject")
    List<Subject> getAll();

    @Query("SELECT * FROM subject WHERE id IN (:subjectIds)")
    List<Subject> loadAllByIds(int[] subjectIds);

    @Query("SELECT * from Anotacoes where subject_id = :anotacoes_id")
            List<Anotacoes> carregarNotas(int[] anotacoes_id);

    @Insert
    void insertAll(Subject... subject);

    @Delete
    void delete(Subject subject);

}
