package com.example.carinaemerim.bancodedados.DAO;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.carinaemerim.bancodedados.Entity.Subject;

import java.util.List;

@Dao
public interface SubjectDAO {
    @Query("SELECT * FROM subject")
    List<SubjectDAO> getAll();

    @Query("SELECT * FROM subject WHERE id IN (:subjectIds)")
    List<SubjectDAO> loadAllByIds(int[] subjectIds);

    @Insert
    void insertAll(Subject... subject);

    @Delete
    void delete(Subject subject);

}
