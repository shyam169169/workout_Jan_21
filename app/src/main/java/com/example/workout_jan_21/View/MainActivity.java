package com.example.workout_jan_21.View;

import android.app.Activity;
import android.os.Bundle;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.example.workout_jan_21.View.Fragments.HistoryFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import java.util.HashMap;


public class MainActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HistoryFragment.SectionsPagerAdapter sectionsPagerAdapter = new HistoryFragment.SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        FloatingActionButton fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return null;
    }
}