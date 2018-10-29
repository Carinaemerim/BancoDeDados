package com.example.carinaemerim.bancodedados;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import com.example.carinaemerim.bancodedados.DAO.AnotacoesDAO;
import com.example.carinaemerim.bancodedados.DAO.SubjectDAO;
import com.example.carinaemerim.bancodedados.Entity.Anotacoes;
import com.example.carinaemerim.bancodedados.Entity.Subject;

@Database(entities = {Subject.class, Anotacoes.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract SubjectDAO subjectDao();
    public abstract AnotacoesDAO anotacoesDAO();



}

