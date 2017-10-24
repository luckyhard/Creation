package com.haonan.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import haonan.creation.R;

/**
 * Created by lenovo on 2017/10/23.
 */

public class PersonInfo extends Fragment {
    public PersonInfo() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_person_info, container, false);

        return root;
    }
}
