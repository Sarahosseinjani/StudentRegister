package com.example.hp.studentregister.db;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.example.hp.studentregister.Student.Student;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert
   void insert(Student student);

    @Query("SELECT * FROM student_table")
   List<Student> getAllStudents();

    @Delete
    void delete(Student student);



}
