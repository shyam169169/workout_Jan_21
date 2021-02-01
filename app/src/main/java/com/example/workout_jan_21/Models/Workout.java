package com.example.workout_jan_21.Models;

import com.example.workout_jan_21.Component.Component;

import java.util.ArrayList;

public class Workout extends Component {
    protected ArrayList<Exercise> exercises;

    @Override
    public boolean saveComponent() {
        return false;
    }
}
