package com.example.workout_jan_21.View.Excercises;

import android.app.Activity;
import android.view.View;

import com.example.workout_jan_21.PresenterViewContractInterface;

public abstract class ExerciseInitiator {

    public static ExercisesInitiatorInterface getExerciseInitiator(String exerciseName, View.OnClickListener onClickListener,
                                                                   PresenterViewContractInterface.IView view) {
        switch(exerciseName) {
            case "cardio":
                return new CardioExercises(onClickListener);
            case "chest":
                return new ChestExercises(onClickListener);
            case "biceps":
                return new BicepsExercises(onClickListener, view);
            case "triceps":
                return new  TricepsExercises(onClickListener);
            case "shoulders":
                return new ShouldersExercises(onClickListener);
            case "lat":
                return new LatExercises(onClickListener);
            case "legs":
                return new LegsExercises(onClickListener);
        }
        return null;
    }

}
