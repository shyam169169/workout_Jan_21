package com.example.workout_jan_21.View.Fragments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.fragment.app.Fragment;

import com.example.workout_jan_21.Presenter.WorkoutPresenter;
import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.example.workout_jan_21.View.ExerciseActivity;
import com.example.workout_jan_21.View.MainActivity;
import com.example.workout_jan_21.View.SignUpPageActivity;

import java.util.HashMap;

public class WorkoutsFragment extends Fragment implements PresenterViewContractInterface.IView {

    PresenterViewContractInterface.IPresenter presenter;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.workout_fragment, parent, false);
        this.presenter = new WorkoutPresenter();
        View chestCard = (LinearLayout) view.findViewById(R.id.id_chest_card);

        chestCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ExerciseActivity.class));
            }
        });
        return view;

    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Context getContext() {
        return this.getActivity();
    }
}
