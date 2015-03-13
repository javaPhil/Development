package com.pwhitman.nerdlauncher;

import android.support.v4.app.Fragment;

/**
 * Created by Philip on 3/10/2015.
 */
public class NerdLauncherActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new NerdLauncherFragment();
    }
}
