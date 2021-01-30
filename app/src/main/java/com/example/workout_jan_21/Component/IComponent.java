package com.example.workout_jan_21.Component;

import android.content.Context;

public interface IComponent {
    public String getName();
    public int getId();
    public boolean saveComponent();
    public void setContext(Context context);

}
