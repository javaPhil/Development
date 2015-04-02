package com.bignerdranch.android.photogallery;

import android.support.v4.app.Fragment;

/**
 * Created by Philip on 4/1/2015.
 */
public class PhotoPageActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new PhotoPageFragment();
    }
}
