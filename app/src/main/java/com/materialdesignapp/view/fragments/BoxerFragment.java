package com.materialdesignapp.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.materialdesignapp.R;

/**
 * Created by roma on 26.08.15.
 */
public class BoxerFragment extends BaseFragment {

    private TextInputLayout tilNameOfDog;
    private TextInputLayout tilAgeOfDog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_boxer, container, false);
        initComponents(view);
        return view;
    }

    @Override
    public void initComponents(View view) {
        tilNameOfDog = (TextInputLayout) view.findViewById(R.id.til_name_of_dog);
        tilAgeOfDog = (TextInputLayout) view.findViewById(R.id.til_age_of_dog);
        tilNameOfDog.setErrorEnabled(true);
        tilAgeOfDog.setErrorEnabled(true);
        tilNameOfDog.setError("Cannot be empty");
        tilAgeOfDog.setError("Cannot be empty");

    }
}
