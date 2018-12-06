package com.example.arafat.architeturalexample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.*;

import java.util.List;


@Dao
public interface NoteDao {

    @Insert
    void insert(Note note);

    @Update
    void update(Note note);

    @Delete
    void delete(Note Note);

    @Query("delete from note_table")
    void deleteAllNotes();

    @Query("select * from note_table order by priority asc")
    LiveData<List<Note>> getAllNotes();
}
