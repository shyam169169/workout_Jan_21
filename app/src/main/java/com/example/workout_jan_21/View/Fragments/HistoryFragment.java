package com.example.workout_jan_21.View.Fragments;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.arch.core.util.Function;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;

import com.example.workout_jan_21.PresenterViewContractInterface;
import com.example.workout_jan_21.R;

import java.util.HashMap;

public class HistoryFragment extends Fragment implements PresenterViewContractInterface.IView {
    private PresenterViewContractInterface iPresenter;

    private ImageView workoutImageView;
    private TextView workoutNameTextView;
    private TextView statusTextView;
    private TextView dateTextView;
    private TextView caloriesTextView;

    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.history_fragment, parent, false);
    }

    private void initViews() {
        /*this.workoutImageView = (ImageView) findViewById(R.id.id_card_history_item_image);
        this.workoutNameTextView = (TextView) findViewById(R.id.id_card_history_item_workout_name);
        this.statusTextView = (TextView) findViewById(R.id.id_card_history_item_status);
        this.dateTextView = (TextView) findViewById(R.id.id_card_history_item_date);
        this.caloriesTextView = (TextView) findViewById(R.id.id_card_history_item_calories);*/
    }

    @Override
    public void display(HashMap<String, Object> params) {

    }

    public static class PageViewModel extends ViewModel {

        private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
        private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
            @Override
            public String apply(Integer input) {
                return "Hello world from section: " + input;
            }
        });

        public void setIndex(int index) {
            mIndex.setValue(index);
        }

        public LiveData<String> getText() {
            return mText;
        }
    }

    /**
     * A [FragmentPagerAdapter] that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public static class SectionsPagerAdapter extends FragmentPagerAdapter {

        @StringRes
        private static final int[] TAB_TITLES = new int[]{R.string.history, R.string.Workouts};
        private final Context mContext;

        public SectionsPagerAdapter(Context context, FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            if(position == 0)
            {
                HistoryFragment frag = new HistoryFragment();
                return frag;
            } else if(position == 1) {
                WorkoutsFragment frag1 = new WorkoutsFragment();
                return frag1;
            }
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mContext.getResources().getString(TAB_TITLES[position]);
        }

        @Override
        public int getCount() {
            // Show 2 total pages.
            return 2;
        }
    }
}
