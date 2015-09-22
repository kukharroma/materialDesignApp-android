package com.materialdesignapp.view.activities;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.materialdesignapp.R;

/**
 * Created by roma on 26.08.15.
 */
public abstract class BaseActivity extends AppCompatActivity {

    abstract public void initComponents();

    public void showFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

}
