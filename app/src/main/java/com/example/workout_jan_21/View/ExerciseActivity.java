package com.example.workout_jan_21.View;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class ExerciseActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);
        View view = (LinearLayout) findViewById(R.id.id_push_up_card);
        view.setOnClickListener(new View.OnClickListener() {
            /**
             * Called when a view has been clicked.
             *
             * @param v The view that was clicked.
             */
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ExerciseActivity.this, DumbellTrackingActivity.class));
            }
        });
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Context getContext() {
        return null;
    }
}
