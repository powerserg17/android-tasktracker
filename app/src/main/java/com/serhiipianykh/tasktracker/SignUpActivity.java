package com.serhiipianykh.tasktracker;

import android.support.v4.app.Fragment;

/**
 * Created by serhiipianykh on 2017-02-25.
 */

public class SignUpActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return SignUpFragment.newInstance();
    }
}
