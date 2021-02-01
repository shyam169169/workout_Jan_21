package com.example.workout_jan_21.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.workout_jan_21.Presenter.SignUpPresenter;
import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class SignUpPageActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {

    private PresenterViewContractInterface.IPresenter presenter;
    public EditText nameEditText;
    public EditText ageEditText;
    public TextView genderTextView;
    public Spinner genderSpinner;
    public EditText weightEditText;
    public Button continueButton;

    /**
     * For Testing
     * @param presenter
     */
    public void setPresenter(PresenterViewContractInterface.IPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        this.initViews();
        this.presenter = this.presenter != null ? this.presenter : new SignUpPresenter();
        this.presenter.attachView(this);
    }

    private void initViews() {
        this.nameEditText = (EditText) findViewById(R.id.id_signup_name_edittext);
        this.ageEditText = (EditText) findViewById(R.id.id_signup_age_edittext);
        this.genderTextView = (TextView) findViewById(R.id.id_signup_gender_text);
        this.genderSpinner = (Spinner) findViewById(R.id.id_signup_gender_spinner);
        this.weightEditText = (EditText) findViewById(R.id.id_signup_weight_edittext);
        this.continueButton = (Button) findViewById(R.id.id_signup_continue_button);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String, Object> params = new HashMap<>();
                params.put("name", nameEditText.getText().toString());
                presenter.saveMessageToDB(params);
                startActivity(new Intent(SignUpPageActivity.this, MainActivity.class));
            }
        });
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return this;
    }


}
