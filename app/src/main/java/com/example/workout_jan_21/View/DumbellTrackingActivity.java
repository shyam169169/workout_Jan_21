package com.example.workout_jan_21.View;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class DumbellTrackingActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttack_dumbells);
    }
    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
