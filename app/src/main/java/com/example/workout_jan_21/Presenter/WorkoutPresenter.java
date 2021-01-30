package com.example.workout_jan_21.Presenter;

import com.example.workout_jan_21.Component.IComponent;
import com.example.workout_jan_21.PresenterViewContractInterface;

import java.util.HashMap;

public class WorkoutPresenter implements PresenterViewContractInterface.IPresenter {

    PresenterViewContractInterface.IView view;
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

    }

    @Override
    public void attachView(PresenterViewContractInterface.IView view) {
        this.view = view;
    }

    @Override
    public void attachModel(IComponent model) {

    }
}
