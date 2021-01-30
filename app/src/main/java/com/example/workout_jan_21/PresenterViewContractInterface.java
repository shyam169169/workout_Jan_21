package com.example.workout_jan_21;

import android.content.Context;

import com.example.workout_jan_21.Component.IComponent;

import java.util.HashMap;

public interface PresenterViewContractInterface {
    // 1:1 relationship between presenter and view

    public interface IPresenter {
        /**
         * Loads the message into the payload and calls the view.display()
         */
        public void loadMessage();

        /**
         * Takes the payload from the view and calls the DB to save the messsage
         * @param params
         */
        public void saveMessageToDB(HashMap<String, Object> params);
        public void attachView(IView view);
        public void attachModel(IComponent model);
    }

    public interface IView {
        public void display(HashMap<String, Object> params);
        public Context getContext();

    }
}
