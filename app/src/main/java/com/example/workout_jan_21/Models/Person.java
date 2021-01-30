package com.example.workout_jan_21.Models;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.workout_jan_21.Component.Component;
import com.example.workout_jan_21.Database.DbHelper;

public class Person extends Component {
    protected static Person instance;
    protected int age;
    protected int weight;
    protected String gender;
    protected enum gender {male, female};

    private Person() {
    }

    public static Person getInstance() {
        if (instance == null) {
            instance = new Person();
        }
        return instance;
    }


    /**
     * DI for testing
     * @param
     */
    public void setDB(DbHelper db) {
        this.db = db;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean saveComponent() {
        if (this.db == null) {
            db = DbHelper.getInstance(this.context);
        }
        // DB query here to save
        SQLiteDatabase dbRead = this.db.getReadableDatabase();
        SQLiteDatabase dbWrite = this.db.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("Name", this.getName());
        dbWrite.insert("PersonDetails", null, contentValues);
        return true;

    }
}
