package com.bignerdranch.android.photogallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;


public class PhotoGalleryActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new PhotoGalleryFragment();
    }

    @Override
    protected int getLayoutResId() {
        return super.getLayoutResId();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
