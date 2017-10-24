package com.haonan.fragment;

import android.nfc.Tag;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import haonan.creation.R;

/**
 * Created by lenovo on 2017/10/23.
 */

public class CompanyInfo  extends Fragment implements View.OnClickListener {
    private static final String TAG = "CompanyInfoFragment";
    private EditText companyName;
    private EditText companyAddress;
    private EditText workEmail;
    private AppCompatButton ok;

    public CompanyInfo() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_company_info, container, false);
        InitView(root);
        if(CheckEmil(root) && CheckName(root) && CheckAddress(root)){
            ok.setOnClickListener(this);
        }else {
            //设置按钮的格式为不能按下
        }

        return root;
    }

    public void InitView(View root) {
        companyName = (EditText) root.findViewById(R.id.etCompanyName);
        companyAddress = (EditText) root.findViewById(R.id.etCompanyAddress);
        workEmail = (EditText) root.findViewById(R.id.etWorkEmail);
        ok = (AppCompatButton) root.findViewById(R.id.btnOk);
    }
    //检查公司名称格式
    public boolean CheckName(View root) {
        final TextInputLayout tilCompanyName = (TextInputLayout) root.findViewById(R.id.tilCompanyName);
        final String name = companyName.getText().toString();
        final String reg = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";
        companyName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    tilCompanyName.setError(null);
                    tilCompanyName.setErrorEnabled(false);
                    Log.i(TAG,"CompanyName获得焦点");
                }else{
                    boolean rs = Reg(reg, name);
                    if(!rs){
                        tilCompanyName.setError("包含非法字符");
                        tilCompanyName.setErrorEnabled(true);
                        Log.i(TAG, name);
                    }
                }
            }
        });
        return Reg(reg, name);
    }
    //检查公司地址格式
    public boolean CheckAddress(View root) {
        final TextInputLayout tilCompanyAddress = (TextInputLayout) root.findViewById(R.id.tilCompanyAddress);
        final String address = companyAddress.getText().toString();
        final String reg = "^[\\u4E00-\\u9FA5A-Za-z0-9]+$";
        companyName.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    tilCompanyAddress.setError(null);
                    tilCompanyAddress.setErrorEnabled(false);
                    Log.i(TAG, "CompanyAddress获得焦点");
                }else {

                    boolean rs = Reg(reg, address);
                    if(rs){
                        tilCompanyAddress.setError("包含非法字符");
                        tilCompanyAddress.setErrorEnabled(true);
                        Log.i(TAG, address);
                    }
                }
            }
        });
        return Reg(reg, address);
    }
    //检查工作邮箱格式
    public boolean CheckEmil(View root) {
        final TextInputLayout tilWorkEmail = (TextInputLayout) root.findViewById(R.id.tilWorkEmail);
        final String email = workEmail.getText().toString();
        final String reg = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";
        workEmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    tilWorkEmail.setError(null);
                    tilWorkEmail.setErrorEnabled(false);
                    Log.i(TAG, "WorkEmail获得焦点");
                }else {

                    boolean rs = Reg(reg, email);
                    if(rs){
                        tilWorkEmail.setError("邮箱格式不正确");
                        tilWorkEmail.setErrorEnabled(true);
                        Log.i(TAG, email);
                    }
                }
            }
        });
        return Reg(reg, email);
    }
    //正交检查方法
    public boolean Reg(String reg, String str){
        Pattern pattern = Pattern.compile(reg);
        Matcher mathcer = pattern.matcher(str);
        boolean rs = mathcer.matches();

        return rs;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnOk:
                ClickOk(v);
                break;
        }
    }

    public void ClickOk(View root){

    }
}

