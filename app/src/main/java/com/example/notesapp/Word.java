package com.example.notesapp;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @NonNull
    public String word;
    @ColumnInfo(name = "text")
    public String mWord;

    public Word(@NonNull String word) {
        this.mWord = word; // store the input value in mWord
    }

    public String getWord(){
        return this.mWord; // it will return the value that will actually enter in input
    }
}
