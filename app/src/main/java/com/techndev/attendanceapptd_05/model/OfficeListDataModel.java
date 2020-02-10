package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OfficeListDataModel {
    @SerializedName("master_id")
    @Expose
    private Integer master_id;

    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("organization_name")
    @Expose
    private String organizationName;
    @SerializedName("sub_domain")
    @Expose
    private String subDomain;
    @SerializedName("mobile")
    @Expose
    private Object mobile;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("reg_staff")
    @Expose
    private double regStaff;
    @SerializedName("present_today")
    @Expose
    private double presentToday;
    @SerializedName("absent_today")
    @Expose
    private double absentToday;
    @SerializedName("late_today")
    @Expose
    private double lateToday;
    @SerializedName("leave_today")
    @Expose
    private double leaveToday;
    @SerializedName("special_duty_today")
    @Expose
    private double specialDutyToday;
    @SerializedName("average_in_time")
    @Expose
    private String averageInTime;
    @SerializedName("average_out_time")
    @Expose
    private String averageOutTime;
    @SerializedName("average_working_time")
    @Expose
    private double averageWorkingTime;
    @SerializedName("total_active_staff")
    @Expose
    private double totalActiveStaff;

    public Integer getMaster_id() {
        return master_id;
    }

    public void setMaster_id(Integer master_id) {
        this.master_id = master_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getSubDomain() {
        return subDomain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRegStaff() {
        return regStaff;
    }

    public void setRegStaff(double regStaff) {
        this.regStaff = regStaff;
    }

    public double getPresentToday() {
        return presentToday;
    }

    public void setPresentToday(double presentToday) {
        this.presentToday = presentToday;
    }

    public double getAbsentToday() {
        return absentToday;
    }

    public void setAbsentToday(double absentToday) {
        this.absentToday = absentToday;
    }

    public double getLateToday() {
        return lateToday;
    }

    public void setLateToday(double lateToday) {
        this.lateToday = lateToday;
    }

    public double getLeaveToday() {
        return leaveToday;
    }

    public void setLeaveToday(double leaveToday) {
        this.leaveToday = leaveToday;
    }

    public double getSpecialDutyToday() {
        return specialDutyToday;
    }

    public void setSpecialDutyToday(double specialDutyToday) {
        this.specialDutyToday = specialDutyToday;
    }

    public String getAverageInTime() {
        return averageInTime;
    }

    public void setAverageInTime(String averageInTime) {
        this.averageInTime = averageInTime;
    }

    public String getAverageOutTime() {
        return averageOutTime;
    }

    public void setAverageOutTime(String averageOutTime) {
        this.averageOutTime = averageOutTime;
    }

    public double getAverageWorkingTime() {
        return averageWorkingTime;
    }

    public void setAverageWorkingTime(double averageWorkingTime) {
        this.averageWorkingTime = averageWorkingTime;
    }

    public double getTotalActiveStaff() {
        return totalActiveStaff;
    }

    public void setTotalActiveStaff(double totalActiveStaff) {
        this.totalActiveStaff = totalActiveStaff;
    }

    @Override
    public String toString() {
        return "OfficeListDataModel{" +
                "master_id=" + master_id +
                ", date='" + date + '\'' +
                ", organizationName='" + organizationName + '\'' +
                ", subDomain='" + subDomain + '\'' +
                ", mobile=" + mobile +
                ", address='" + address + '\'' +
                ", regStaff=" + regStaff +
                ", presentToday=" + presentToday +
                ", absentToday=" + absentToday +
                ", lateToday=" + lateToday +
                ", leaveToday=" + leaveToday +
                ", specialDutyToday=" + specialDutyToday +
                ", averageInTime='" + averageInTime + '\'' +
                ", averageOutTime='" + averageOutTime + '\'' +
                ", averageWorkingTime=" + averageWorkingTime +
                ", totalActiveStaff=" + totalActiveStaff +
                '}';
    }
}
