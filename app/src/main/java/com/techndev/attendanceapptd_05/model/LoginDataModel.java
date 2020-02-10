package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LoginDataModel {
    @SerializedName("token")
    @Expose
    private String token;
    @SerializedName("role_id")
    @Expose
    private Integer roleId;
    @SerializedName("all_session")
    @Expose
    private AllSession allSession;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public AllSession getAllSession() {
        return allSession;
    }

    public void setAllSession(AllSession allSession) {
        this.allSession = allSession;
    }
}
