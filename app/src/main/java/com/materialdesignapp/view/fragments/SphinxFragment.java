package com.materialdesignapp.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.materialdesignapp.R;

/**
 * Created by roma on 26.08.15.
 */
public class SphinxFragment extends BaseFragment {

    RelativeLayout mRootLayout;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sphinx, container, false);
        initComponents(view);
        return view;
    }


    @Override
    public void initComponents(View view) {
        mRootLayout = (RelativeLayout) view.findViewById(R.id.root_sphinx_layout);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Snackbar.make(mRootLayout, "Hello", Snackbar.LENGTH_LONG).setAction("Dissmiss", new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        }).show();
    }

}
