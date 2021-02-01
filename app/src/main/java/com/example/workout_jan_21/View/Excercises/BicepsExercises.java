package com.example.workout_jan_21.View.Excercises;

import android.view.View;

import androidx.cardview.widget.CardView;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

public class BicepsExercises implements ExercisesInitiatorInterface {

    protected View.OnClickListener onClickListener;

    //Constants
    public static final int BICEPS_DUMBELL_ID = 1;
    public static final int BICEPS_BARBELL_ID = 2;
    public static final int BICEPS_BICEPS_CURL_ID = 3;
    public static final int BICEPS_BICEPS_EZ_BAR_CURL_ID = 4;
    public static final int BICEPS_DUMBELL_CURL_ID = 5;
    public static final int BICEPS_HAMMER_CURL_ID = 6;
    public static final int BICEPS_OVER_HEADED_CURL_ID = 7;

    protected PresenterViewContractInterface.IView view;

    public BicepsExercises (View.OnClickListener onClickListener, PresenterViewContractInterface.IView view) {
        this.onClickListener = onClickListener;
        this.view = view;
    }

    @Override
    public void initiateViews() {
        CardView dumbells = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_dumbell_card);
        CardView barbells = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_barbell_card);
        CardView curls = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_curls_card);
        CardView ezBarCurl = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_ez_bar_curl_card);
        CardView dumbellCurl = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_dumbell_curl_card);
        CardView hammerCurl = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_hammer_curl_card);
        CardView overheadCurl = (CardView) this.view.getActivity().findViewById(R.id.id_biceps_over_headed_curl_card);

        dumbells.setOnClickListener(this.onClickListener);
        barbells.setOnClickListener(this.onClickListener);
        curls.setOnClickListener(this.onClickListener);
        ezBarCurl.setOnClickListener(this.onClickListener);
        dumbellCurl.setOnClickListener(this.onClickListener);
        hammerCurl.setOnClickListener(this.onClickListener);
        overheadCurl.setOnClickListener(this.onClickListener);
    }

    @Override
    public int getExerciseId(int viewId) {
        switch(viewId) {
            case R.id.id_biceps_dumbell_card:
                return this.BICEPS_DUMBELL_ID;
            case R.id.id_biceps_barbell_card:
                return this.BICEPS_BARBELL_ID;
            case R.id.id_biceps_curls_card:
                return this.BICEPS_BICEPS_CURL_ID;
            case R.id.id_biceps_ez_bar_curl_card:
                return this.BICEPS_BICEPS_EZ_BAR_CURL_ID;
            case R.id.id_biceps_dumbell_curl_card:
                return this.BICEPS_DUMBELL_CURL_ID;
            case R.id.id_biceps_hammer_curl_card:
                return this.BICEPS_HAMMER_CURL_ID;
            case R.id.id_biceps_over_headed_curl_card:
                return this.BICEPS_OVER_HEADED_CURL_ID;

        }
        return 0;
    }
}
