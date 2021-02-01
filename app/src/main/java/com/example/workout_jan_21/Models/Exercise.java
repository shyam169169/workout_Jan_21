package com.example.workout_jan_21.Models;

import com.example.workout_jan_21.Component.Component;

public class Exercise extends Component {
    protected int sets;
    protected int reps;
    protected int weights;

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeights() {
        return weights;
    }

    public void setWeights(int weights) {
        this.weights = weights;
    }


    @Override
    public boolean saveComponent() {
        return false;
    }
}
