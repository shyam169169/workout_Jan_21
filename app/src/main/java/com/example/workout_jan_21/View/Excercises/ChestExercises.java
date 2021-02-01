package com.example.workout_jan_21.View.Excercises;

import android.view.View;

public class ChestExercises implements ExercisesInitiatorInterface {

    protected View.OnClickListener onClickListener;

    public ChestExercises (View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    public void initiateViews() {

    }

    @Override
    public int getExerciseId(int viewId) {
        return 0;
    }
}
