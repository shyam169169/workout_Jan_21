package com.example.workout_jan_21.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DbHelper extends SQLiteOpenHelper {
    public static DbHelper instance;
    public Context context;
    public static final String DATABASE_NAME = "WorkoutJan21.db";
    public static final String WORKOUTS_TABLE_NAME = "Workouts";
    public static final String WORKOUTS_COLUMN_ID = "Id";
    public static final String WORKOUTS_COLUMN_NAME = "Name";

    private DbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        instance = this;
        SQLiteDatabase db = this.getWritableDatabase();
    }

    public static DbHelper getInstance(Context context) {
        if (instance == null) {
            return (new DbHelper(context));
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "create table Workouts " +
                        "(Id integer primary key AUTOINCREMENT, Name text, IsActive int);"
        );
        db.execSQL(
                "Create table Exercises " +
                        "(Id integer primary key AUTOINCREMENT, Name text,WorkoutId integer,  Foreign key (WorkoutId) references Workouts(Id));"

        );
        db.execSQL(
                "Create table WorkoutAndExerciseDetails " +
                        "(Id integer primary key AUTOINCREMENT, ExerciseId integer,Sets integer, Reps integer, Kgs integer, Lbs integer," +
                        " Kms decimal, Mil decimal, Incl decimal, Mins integer, Calories integer, IsCurrent integer, Speed varchar(10), Date date, " +
                        "Foreign key (ExerciseId) references Exercises(Id) );"
        );
        db.execSQL(
                "Create table PersonDetails " +
                        "(Id integer primary key AUTOINCREMENT, Name text, Gender text, Age integer, Weight integer );"
        );

        db.execSQL(
                "Create table CaloriesInfo " +
                        "(Id integer primary key AUTOINCREMENT, Name text, Type text, Weight integer );"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS Workouts");
        onCreate(db);
    }
}

