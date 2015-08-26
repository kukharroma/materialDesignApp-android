package com.materialdesignapp.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.materialdesignapp.R;

/**
 * Created by roma on 26.08.15.
 */
public class ShepherdFragment extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_shepherd, container, false);
        initComponents(view);
        return view;
    }

    @Override
    public void initComponents(View view) {

    }
}
