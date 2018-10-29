package com.example.carinaemerim.bancodedados.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Subject.class,
        parentColumns ="id",
        childColumns="subject_id",
        onDelete = ForeignKey.CASCADE),
        indices = @Index(("subject_id")))
public class Anotacoes {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "saved_date")
    private String saved_date;

    @ColumnInfo(name = "saved_subject")
    private String saved_subject;

    @ColumnInfo(name = "note_text")
    private String note_text;

    @ColumnInfo(name = "subject_id")
    private String subject_id;

    public String getSaved_date() {
        return saved_date;
    }

    public void setSaved_date(String saved_date) {
        this.saved_date = saved_date;
    }

    public String getSaved_subject() {
        return saved_subject;
    }

    public void setSaved_subject(String disciplina) {
        this.saved_subject = disciplina;
    }

    public String getNote_text() {
        return note_text;
    }

    public void setNote_text(String note_text) {
        this.note_text = note_text;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
