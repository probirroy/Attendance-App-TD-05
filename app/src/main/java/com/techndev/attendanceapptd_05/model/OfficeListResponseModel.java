package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OfficeListResponseModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("OfficeList")
    @Expose
    private List<OfficeListDataModel> officeList = null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OfficeListDataModel> getOfficeList() {
        return officeList;
    }

    public void setOfficeList(List<OfficeListDataModel> officeList) {
        this.officeList = officeList;
    }
}
