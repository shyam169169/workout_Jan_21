package com.example.workout_jan_21.Presenter;

import com.example.workout_jan_21.Component.IComponent;
import com.example.workout_jan_21.Models.Person;
import com.example.workout_jan_21.PresenterViewContractInterface;
import java.util.HashMap;

public class SignUpPresenter implements PresenterViewContractInterface.IPresenter {
    protected Person person;
    protected PresenterViewContractInterface.IView view;

    public SignUpPresenter() {
        this.person = Person.getInstance();
    }

    public void attachView(PresenterViewContractInterface.IView view) {
        this.view = view;
    }

    public void attachModel(IComponent person) {
        this.person = person == null ? Person.getInstance() : (Person) person;
    }

    public IComponent getModel() {
        return this.person;
    }

    public PresenterViewContractInterface.IView getView() {
        return this.view;
    }

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
        this.person.setContext(this.view.getActivity());
        this.person.setName((String) params.get("name"));
        this.person.saveComponent();
    }
}
