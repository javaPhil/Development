package com.bignerdranch.android.draganddraw;

import android.graphics.PointF;

/**
 * Created by Philip on 4/1/2015.
 */
public class Box {
    private PointF mOrigin;
    private PointF mCurrent;

    public Box(PointF origin){
        mOrigin = mCurrent = origin;
    }

    public PointF getCurrent(){
        return mCurrent;
    }
    public void setCurrent(PointF current){
        mCurrent = current;
    }
    public PointF getOrigin(){
        return mOrigin;
    }
}
