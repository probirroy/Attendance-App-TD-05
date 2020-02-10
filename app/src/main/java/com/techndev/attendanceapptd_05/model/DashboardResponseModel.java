
package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardResponseModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("dashborad_info")
    @Expose
    private DashboradInfo dashboradInfo;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DashboradInfo getDashboradInfo() {
        return dashboradInfo;
    }

    public void setDashboradInfo(DashboradInfo dashboradInfo) {
        this.dashboradInfo = dashboradInfo;
    }

}
