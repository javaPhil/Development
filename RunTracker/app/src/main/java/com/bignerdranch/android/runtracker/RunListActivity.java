package com.bignerdranch.android.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by Philip on 4/8/2015.
 */
public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
