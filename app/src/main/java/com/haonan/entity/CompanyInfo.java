package com.haonan.entity;

import java.io.FileInputStream;

/**
 * Created by lenovo on 2017/10/24.
 */

public class CompanyInfo {
    private String Cid;
    private String workEmail;
    private FileInputStream companyLogo;        //二进制数据用来存储图片
    private String companyName;
    private String companyBrief;
    private String companyAddress;
    private String companyField;
    private String companySize;
    private String checkImage;
    private int companyCheck = 0;

    public void setCid(String cid) {
        Cid = cid;
    }

    public void setWorkEmail(String workEmail) {
        this.workEmail = workEmail;
    }

    public void setCompanyLogo(FileInputStream companyLogo) {
        this.companyLogo = companyLogo;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCompanyBrief(String companyBrief) {
        this.companyBrief = companyBrief;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public void setCompanyField(String companyField) {
        this.companyField = companyField;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public void setCheckImage(String checkImage) {
        this.checkImage = checkImage;
    }

    public void setCompanyCheck(int companyCheck) {
        this.companyCheck = companyCheck;
    }

    public String getCid() {
        return Cid;
    }

    public String getWorkEmail() {
        return workEmail;
    }

    public String getCompanyName() {
        return companyName;
    }

    public FileInputStream getCompanyLogo() {
        return companyLogo;
    }

    public String getCompanyBrief() {
        return companyBrief;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public String getCompanySize() {
        return companySize;
    }

    public String getCompanyField() {
        return companyField;
    }

    public String getCheckImage() {
        return checkImage;
    }

    public int getCompanyCheck() {
        return companyCheck;
    }
}
