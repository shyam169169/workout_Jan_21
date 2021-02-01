package com.example.workout_jan_21.View.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.workout_jan_21.Presenter.WorkoutPresenter;
import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.example.workout_jan_21.View.ExerciseActivity;

import java.util.HashMap;

public class WorkoutsFragment extends Fragment implements PresenterViewContractInterface.IView {

    PresenterViewContractInterface.IPresenter presenter;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.workout_fragment, parent, false);
        this.presenter = new WorkoutPresenter();

        View cardio = (CardView) view.findViewById(R.id.id_cardio_card);
        View biceps = (CardView) view.findViewById(R.id.id_biceps_card);
        View chest = (CardView) view.findViewById(R.id.id_chest_card);
        View triceps = (CardView) view.findViewById(R.id.id_triceps_card);
        View shoulders = (CardView) view.findViewById(R.id.id_shoulders_card);
        View legs = (CardView) view.findViewById(R.id.id_legs_card);
        View lat = (CardView) view.findViewById(R.id.id_lat_card);
        cardio.setOnClickListener(workoutListener);
        biceps.setOnClickListener(workoutListener);
        chest.setOnClickListener(workoutListener);
        triceps.setOnClickListener(workoutListener);
        shoulders.setOnClickListener(workoutListener);
        legs.setOnClickListener(workoutListener);
        lat.setOnClickListener(workoutListener);
        return view;

    }

    public View.OnClickListener workoutListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exerciseActivityIntent = new Intent(getActivity(), ExerciseActivity.class);
                int id = v.getId();
                exerciseActivityIntent.putExtra("workoutView", v.getId());
                startActivity(exerciseActivityIntent);
            };
        };


    @Override
    public void display(HashMap<String, Object> params) {

    }
}
