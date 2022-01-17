package com.example.workout_jan_21.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.Presenter.DumbellTrackingPresenter;
import com.example.workout_jan_21.Presenter.HistoryPresenter;
import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class DumbellTrackingActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {

    protected PresenterViewContractInterface.IPresenter presenter;

    protected TextView setsText;
    protected TextView repsText;
    protected TextView weightsText;
    protected Button continueBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ttack_dumbells);
        Intent callingIntent = getIntent();
        int id = callingIntent.getIntExtra("id", 0);
        this.presenter = new DumbellTrackingPresenter();
        this.presenter.attachView(this);

        SeekBar sets = (SeekBar) findViewById(R.id.id_seekbar_sets);
        sets.setMax(100);

        SeekBar reps = (SeekBar) findViewById(R.id.id_seekbar_reps);
        reps.setMax(100);
        SeekBar weights = (SeekBar) findViewById(R.id.id_seekbar_weights);
        weights.setMax(100);
        setsText = (TextView) findViewById(R.id.id_seekbar_sets_text);
        repsText = (TextView) findViewById(R.id.id_seekbar_reps_text);
        weightsText = (TextView) findViewById(R.id.id_seekbar_weights_text);

        sets.setOnSeekBarChangeListener(seekBarChangeListener);
        reps.setOnSeekBarChangeListener(seekBarChangeListener);
        weights.setOnSeekBarChangeListener(seekBarChangeListener);

        continueBtn = (Button) findViewById(R.id.id_dumbell_tracking_continue_button);

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DumbellTrackingActivity.this, InsightsActivity.class));
            }
        });

        HashMap<String, Object> params = new HashMap<>();
        params.put("sets", setsText.getText().toString());
        params.put("reps", repsText.getText().toString());
        params.put("weights", weightsText.getText().toString());
        params.put("id", id);
    }

    private SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {
            int progressval = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressval = progress;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                switch (seekBar.getId()) {
                    case R.id.id_seekbar_reps:
                        repsText.setText("" + progressval);
                    case R.id.id_seekbar_sets:
                        setsText.setText("" + progressval);
                    case R.id.id_seekbar_weights:
                        weightsText.setText("" + progressval);
                }
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                switch (seekBar.getId()) {
                    case R.id.id_seekbar_reps:
                        repsText.setText("" + progressval);
                    case R.id.id_seekbar_sets:
                        setsText.setText("" + progressval);
                    case R.id.id_seekbar_weights:
                        weightsText.setText("" + progressval);
                }
            }
    };


    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return null;
    }
}
