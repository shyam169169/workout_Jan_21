package com.example.workout_jan_21.Presenter;

import com.example.workout_jan_21.Models.Person;
import com.example.workout_jan_21.Presenter.SignUpPresenter;
import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.View.SignUpPageActivity;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class SignUpPresenterTest extends TestCase {

    private SignUpPresenter presenter;

    @Mock
    private Person mockPerson;

    @Before
    public void setUp() {
        // Mock view and model
        PresenterViewContractInterface.IView mockView = Mockito.mock(SignUpPageActivity.class);
        this.mockPerson = Mockito.mock(Person.class);
        this.presenter = new SignUpPresenter();
        this.presenter.attachModel(mockPerson);
        this.presenter.attachView(mockView);
    }

    @Test
    public void testSignUpPresenterCallsModelSaveComponent() {
        HashMap<String, Object> params = new HashMap<>();
        params.put("name", "Shyam");
        this.presenter.saveMessageToDB(params);
        verify(this.mockPerson, times(1)).saveComponent();
        verify(this.mockPerson, times(1)).setName("Shyam");
    }
}
