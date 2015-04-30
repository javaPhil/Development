package com.bignerdranch.android.runtracker;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;

/**
 * Created by Philip on 4/30/2015.
 */
public class LocationListCursorLoader extends SQLiteCursorLoader {
    private long mRunId;

    public LocationListCursorLoader(Context c, long runId){
        super(c);
        mRunId = runId;
    }

    @Override
    protected Cursor loadCursor() {
        return RunManager.get(getContext()).queryLocationsForRun(mRunId);
    }
}
