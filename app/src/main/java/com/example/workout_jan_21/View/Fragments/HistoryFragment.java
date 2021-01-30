package com.example.workout_jan_21.View.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class HistoryFragment extends AppCompatActivity implements PresenterViewContractInterface.IView {
    private PresenterViewContractInterface iPresenter;

    private ImageView workoutImageView;
    private TextView workoutNameTextView;
    private TextView statusTextView;
    private TextView dateTextView;
    private TextView caloriesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        this.initViews();
    }

    private void initViews() {
        this.workoutImageView = (ImageView) findViewById(R.id.id_card_history_item_image);
        this.workoutNameTextView = (TextView) findViewById(R.id.id_card_history_item_workout_name);
        this.statusTextView = (TextView) findViewById(R.id.id_card_history_item_status);
        this.dateTextView = (TextView) findViewById(R.id.id_card_history_item_date);
        this.caloriesTextView = (TextView) findViewById(R.id.id_card_history_item_calories);
    }


    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
