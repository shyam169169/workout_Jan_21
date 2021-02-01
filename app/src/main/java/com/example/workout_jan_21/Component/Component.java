package com.example.workout_jan_21.Component;

import android.content.Context;

import com.example.workout_jan_21.Database.DbHelper;

public abstract class Component implements IComponent{
    /**
     * Name of the component
     */
    protected String name;
    protected Context context;
    protected DbHelper db;

    /**
     * Id of the component
     */
    public int id;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public abstract boolean saveComponent();


    @Override
    public void setContext(Context context) {
        this.context = context;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
