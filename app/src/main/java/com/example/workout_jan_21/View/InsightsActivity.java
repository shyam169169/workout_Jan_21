package com.example.workout_jan_21.View;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import org.eazegraph.lib.models.PieModel;

import java.util.ArrayList;
import java.util.HashMap;

public class InsightsActivity extends AppCompatActivity implements PresenterViewContractInterface.IView {

    PieChart pieChart;
    PieData pieData;
    PieDataSet pieDataSet;
    ArrayList pieEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workouts_insights);
        pieChart = findViewById(R.id.id_pie_chart);
        pieChart.setRotationEnabled(true);
        pieChart.setHoleRadius(20f);
        pieChart.setCenterText("Workouts");
        this.createPieChart(new int[]{20, 30, 40, 33, 5});


    }

    private void createPieChart(int[] data) {
        pieEntries = new ArrayList<PieEntry>();
        pieEntries.add(new PieEntry(55,"Biceps"));
        pieEntries.add(new PieEntry(14,"Triceps"));
        pieEntries.add(new PieEntry(31,"Shoulders"));
        pieEntries.add(new PieEntry(61,"Lat"));
        pieDataSet = new PieDataSet(pieEntries, "This Month");

        pieData = new PieData(pieDataSet);
        pieChart.setData(pieData);
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieDataSet.setSliceSpace(2f);
        pieDataSet.setValueTextColor(Color.WHITE);
        pieDataSet.setValueTextSize(10f);

    }


    public void display(HashMap<String, Object> params) {

    }

    @Override
    public Activity getActivity() {
        return this;
    }
}
