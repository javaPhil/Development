package com.bignerdranch.android.runtracker;

import android.content.Context;

/**
 * Created by Philip on 4/30/2015.
 */
public class RunLoader extends DataLoader<Run>{
    private long mRunId;

    public RunLoader(Context context, long runId){
        super(context);
        mRunId = runId;
    }

    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}
