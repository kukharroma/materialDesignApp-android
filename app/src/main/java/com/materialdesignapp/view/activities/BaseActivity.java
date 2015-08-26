package com.materialdesignapp.view.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.materialdesignapp.R;

/**
 * Created by roma on 26.08.15.
 */
public class BaseActivity extends AppCompatActivity {

    public void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }
}
