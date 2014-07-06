package com.bignerdranch.android.criminalintent;

import java.util.UUID;

/**
 * Created by Philip on 7/6/2014.
 */
public class Crime {


    private UUID mId;
    private String mTitle;

    public Crime(){
        //generate Unique ID
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
}
