package com.haonan.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import haonan.creation.R;

/**
 * Created by lenovo on 2017/10/23.
 */

public class Choose extends Fragment implements View.OnClickListener {

    private AppCompatButton btnPublish;
    private AppCompatButton btnCollect;

    public Choose() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_choose, container, false);
        InitView(root);
        btnCollect.setOnClickListener(this);
        btnPublish.setOnClickListener(this);
        return root;
    }

    public void InitView(View root){
        btnCollect = (AppCompatButton) root.findViewById(R.id.btnCollect);
        btnPublish = (AppCompatButton) root.findViewById(R.id.btnPublish);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnCollect:
                ClickCollect();
                break;
            case R.id.btnPublish:
                CliskPublish();
                break;
        }
    }

    public void ClickCollect(){
        getFragmentManager().beginTransaction()
                .addToBackStack(null)
                .replace(R.id.activity_main, new CompanyInfo())
                .commit();
    }

    public void CliskPublish() {
        getFragmentManager().beginTransaction()
                .addToBackStack(null)
                .replace(R.id.activity_main, new PersonInfo())
                .commit();
    }
}
