package com.example.carinaemerim.bancodedados.Entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "saved_date")
    private String saved_date;

    @ColumnInfo(name = "shortname")
    private String shortname;

    @ColumnInfo(name="fullname")
    private String fullname;

    @ColumnInfo(name="visible")
    private int visible;

    @ColumnInfo(name="format")
    private String format;

    @ColumnInfo(name="showgrades")
    private boolean showgrades;

    @ColumnInfo(name="lang")
    private String lang;

    @ColumnInfo(name="enablecompletion")
    private boolean enablecompletion;

    @ColumnInfo(name="category")
    private int category;

    @ColumnInfo(name="summary")
    private String summary = "Curso sem descrição";

    @Ignore
    private List<Anotacoes> Subject_anotacoes = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSaved_date() {
        return saved_date;
    }

    public void setSaved_date(String saved_date) {
        this.saved_date = saved_date;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isShowgrades() {
        return showgrades;
    }

    public void setShowgrades(boolean showgrades) {
        this.showgrades = showgrades;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public boolean isEnablecompletion() {
        return enablecompletion;
    }

    public void setEnablecompletion(boolean enablecompletion) {
        this.enablecompletion = enablecompletion;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Anotacoes> getSubject_anotacoes() {
        return Subject_anotacoes;
    }

    public void setSubject_anotacoes(List<Anotacoes> subject_anotacoes) {
        Subject_anotacoes = subject_anotacoes;
    }
}
