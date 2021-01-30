package com.example.workout_jan_21.Presenter;

import com.example.workout_jan_21.Component.IComponent;
import com.example.workout_jan_21.Models.Workout;
import com.example.workout_jan_21.PresenterViewContractInterface;
import java.util.HashMap;

public class HistoryPresenter implements PresenterViewContractInterface.IPresenter {
    protected Workout workout;
    protected PresenterViewContractInterface.IView view;

    public HistoryPresenter(Workout workout, PresenterViewContractInterface.IView view) {
        this.workout = workout;
        this.view = view;
    }

    /**
     * Loads the message into the payload and calls the view.display()
     */
    @Override
    public void loadMessage() {
        // Get the following from the workout object
        // workout name
        // calories burnt
        // date
        // status
        HashMap<String, Object> params = new HashMap<>();
        this.view.display(params);
    }

    /**
     * Takes the payload from the view and calls the DB to save the messsage
     * @param params
     */
    @Override
    public void saveMessageToDB(HashMap<String, Object> params) {
        // Save to the view object
    }

    @Override
    public void attachView(PresenterViewContractInterface.IView view) {
        this.view = view;
    }

    @Override
    public void attachModel(IComponent model) {
        this.workout = (Workout) model;
    }
}
