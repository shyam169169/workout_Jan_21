package com.example.workout_jan_21.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.example.workout_jan_21.View.Excercises.ExerciseInitiator;
import com.example.workout_jan_21.View.Excercises.ExercisesInitiatorInterface;

import java.io.Serializable;
import java.util.HashMap;

public class ExerciseActivity extends AppCompatActivity implements PresenterViewContractInterface.IView, Serializable {
    protected ExercisesInitiatorInterface exerciseInitiator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent callingIntent = getIntent();
        int id = callingIntent.getIntExtra("workoutView", 0);
        // Set the respective view
        exerciseInitiator = null;
        switch (id) {
            case R.id.id_cardio_card:
                setContentView(R.layout.activity_exercises_cardio);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("cardio", cardioTrackingListener, this);
                break;
            case R.id.id_biceps_card:
                setContentView(R.layout.activity_biceps);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("biceps", dumbellTrackingListener, this);
                break;
            case R.id.id_chest_card:
                setContentView(R.layout.activity_chest);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("chest", dumbellTrackingListener, this);
                break;
            case R.id.id_triceps_card:
                setContentView(R.layout.activity_triceps);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("triceps", dumbellTrackingListener, this);
                break;
            case R.id.id_shoulders_card:
                setContentView(R.layout.activity_shoulders);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("shoulders", dumbellTrackingListener, this);
                break;
            case R.id.id_legs_card:
                setContentView(R.layout.activity_legs);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("legs", dumbellTrackingListener, this);
                break;
            case R.id.id_lat_card:
                setContentView(R.layout.activity_lat);
                exerciseInitiator = ExerciseInitiator.getExerciseInitiator("lat", dumbellTrackingListener, this);
                break;
            case R.id.id_more_card:
                break;
        }
        exerciseInitiator.initiateViews();
    }

    public View.OnClickListener dumbellTrackingListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ExerciseActivity.this, DumbellTrackingActivity.class);
            int exerciseId = exerciseInitiator.getExerciseId(v.getId());
            intent.putExtra("id", exerciseId);
            startActivity(intent);
        };
    };

    public View.OnClickListener cardioTrackingListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ExerciseActivity.this, DumbellTrackingActivity.class));
        };
    };

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return this;
    }
}
