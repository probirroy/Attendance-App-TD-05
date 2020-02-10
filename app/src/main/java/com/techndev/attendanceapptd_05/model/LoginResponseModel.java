package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginResponseModel {
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("data")
    @Expose
    private LoginDataModel data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LoginDataModel getData() {
        return data;
    }

    public void setData(LoginDataModel data) {
        this.data = data;
    }
}
