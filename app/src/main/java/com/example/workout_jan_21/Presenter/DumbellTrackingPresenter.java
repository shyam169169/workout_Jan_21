package com.example.workout_jan_21.Presenter;

import com.example.workout_jan_21.Component.IComponent;
import com.example.workout_jan_21.Models.Exercise;
import com.example.workout_jan_21.PresenterViewContractInterface;

import java.util.HashMap;

public class DumbellTrackingPresenter implements PresenterViewContractInterface.IPresenter {
    protected Exercise exercise;
    protected PresenterViewContractInterface.IView view;
    /**
     * Loads the message into the payload and calls the view.display()
     */
    @Override
    public void loadMessage() {

    }

    /**
     * Takes the payload from the view and calls the DB to save the messsage
     *
     * @param params
     */
    @Override
    public void saveMessageToDB(HashMap<String, Object> params) {
        this.exercise.setContext(this.view.getActivity());
        // Set the values of the component from params.
        this.exercise.setReps((int)params.get("reps"));
        this.exercise.setWeights((int)params.get("weights"));
        this.exercise.setSets((int)params.get("sets"));
        this.exercise.setName((String)params.get("name"));
        this.exercise.setId((int)params.get("id"));
        this.exercise.saveComponent();
    }

    @Override
    public void attachView(PresenterViewContractInterface.IView view) {
        this.view = view;
    }

    @Override
    public void attachModel(IComponent model) {
        this.exercise = (Exercise) model;
    }
}
