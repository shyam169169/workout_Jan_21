package com.example.workout_jan_21.View;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.example.workout_jan_21.View.Fragments.HistoryFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import java.util.HashMap;

public class HistoryActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return null;
    }
}
