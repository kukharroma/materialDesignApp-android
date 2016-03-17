package com.materialdesignapp.view.activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.crashlytics.android.Crashlytics;
import com.materialdesignapp.R;
import com.materialdesignapp.view.activities.collapsingToolbar.CollapsingToolbarLayoutActivity1;
import com.materialdesignapp.view.activities.collapsingToolbar.CollapsingToolbarLayoutActivity2;
import com.materialdesignapp.view.activities.collapsingToolbar.CollapsingToolbarLayoutActivity3;
import com.materialdesignapp.view.activities.collapsingToolbarFB.CollapsingToolbarLayoutFBActivity;
import io.fabric.sdk.android.Fabric;

/**
 * Created by roma on 25.08.15.
 */
public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private ActionBarDrawerToggle drawerToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics());
        setContentView(R.layout.activity_main);
        initComponents();
    }

    public void initComponents() {
        toolbar = (Toolbar) findViewById(R.id.app_toolbar);
        setSupportActionBar(toolbar);
        navigationView = (NavigationView) findViewById(R.id.nv_menu);
        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(drawerToggle);
        drawerToggle.syncState();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.settings)
            return true;

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        drawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        navigate(menuItem.getItemId());
        return true;
    }

    public void navigate(int navigateItemId) {
        switch (navigateItemId) {
            case R.id.collapsing_toolbar_layout_item1: {
                startActivity(new Intent(this, CollapsingToolbarLayoutActivity1.class));
                break;
            }
            case R.id.collapsing_toolbar_layout_item2: {
                startActivity(new Intent(this, CollapsingToolbarLayoutActivity2.class));
                break;
            }
            case R.id.collapsing_toolbar_layout_item3: {
                startActivity(new Intent(this, CollapsingToolbarLayoutActivity3.class));
                break;
            }
            case R.id.collapsing_toolbar_with_FB_item: {
                startActivity(new Intent(this, CollapsingToolbarLayoutFBActivity.class));
                break;
            }

        }
    }

    public void showFragment(Fragment fragment) {
        drawerLayout.closeDrawer(GravityCompat.START);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
    }

    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START))
            drawerLayout.closeDrawer(GravityCompat.START);
        else
            super.onBackPressed();
    }
}
