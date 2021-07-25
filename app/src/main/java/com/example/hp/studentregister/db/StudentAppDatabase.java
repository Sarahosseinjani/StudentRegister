package com.example.hp.studentregister.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.hp.studentregister.Student.Student;
//Database class
@Database(entities = {Student.class},version = 1)
public abstract class StudentAppDatabase extends RoomDatabase {

    public abstract StudentDao getStudentDao();

}
