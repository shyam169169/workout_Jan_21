package com.example.workout_jan_21.View;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.io.Serializable;
import java.util.HashMap;

public class ExerciseActivity extends AppCompatActivity implements PresenterViewContractInterface.IView, Serializable {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent callingIntent = getIntent();
        int id = callingIntent.getIntExtra("workoutView", 0);

        // Set the respective view
        switch (id) {
            case R.id.id_cardio_card:
                setContentView(R.layout.activity_exercises_cardio);
                break;
            case R.id.id_biceps_card:
                setContentView(R.layout.activity_biceps);
                break;
            case R.id.id_chest_card:
                setContentView(R.layout.activity_chest);
                break;
            case R.id.id_triceps_card:
                setContentView(R.layout.activity_triceps);
                break;
            case R.id.id_shoulders_card:
                setContentView(R.layout.activity_shoulders);
                break;
            case R.id.id_legs_card:
                setContentView(R.layout.activity_legs);
                break;
            case R.id.id_lat_card:
                setContentView(R.layout.activity_lat);
                break;
        }
    }

    public View.OnClickListener dumbellTrackingListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            startActivity(new Intent(ExerciseActivity.this, DumbellTrackingActivity.class));
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
    public Context getContext() {
        return null;
    }
}
