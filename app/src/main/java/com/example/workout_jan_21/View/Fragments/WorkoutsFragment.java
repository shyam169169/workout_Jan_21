package com.example.workout_jan_21.View.Fragments;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.example.workout_jan_21.PresenterViewContractInterface;
import java.util.HashMap;

public class WorkoutsFragment extends Fragment implements PresenterViewContractInterface.IView {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Context getContext() {
        return this.getActivity();
    }
}
