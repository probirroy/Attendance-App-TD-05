
package com.techndev.attendanceapptd_05.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboradInfo {

    @SerializedName("average_in_time")
    @Expose
    private String averageInTime;
    @SerializedName("average_out_time")
    @Expose
    private String averageOutTime;
    @SerializedName("avg_working_hours")
    @Expose
    private String avgWorkingHours;
    @SerializedName("pending_leave_total")
    @Expose
    private Integer pendingLeaveTotal;
    @SerializedName("login_type")
    @Expose
    private String loginType;
    @SerializedName("bio_metric_tem_off_staff")
    @Expose
    private Integer bioMetricTemOffStaff;
    @SerializedName("all_average_time")
    @Expose
    private AllAverageTime allAverageTime;
    @SerializedName("where")
    @Expose
    private List<Object> where = null;
    @SerializedName("special_duty_total")
    @Expose
    private Integer specialDutyTotal;
    @SerializedName("leave_total")
    @Expose
    private Integer leaveTotal;
    @SerializedName("register_staff")
    @Expose
    private Integer registerStaff;
    @SerializedName("section_info_array")
    @Expose
    private List<String> sectionInfoArray = null;
    @SerializedName("total_section_array")
    @Expose
    private List<Integer> totalSectionArray = null;
    @SerializedName("present_section_array")
    @Expose
    private List<Integer> presentSectionArray = null;
    @SerializedName("absent_section_array")
    @Expose
    private List<Integer> absentSectionArray = null;
    @SerializedName("calDate")
    @Expose
    private String calDate;
    @SerializedName("masterInfodash")
    @Expose
    private MasterInfodash masterInfodash;
    @SerializedName("check")
    @Expose
    private Integer check;
    @SerializedName("activeStaff")
    @Expose
    private Integer activeStaff;
    @SerializedName("accessOffice")
    @Expose
    private Integer accessOffice;
    @SerializedName("master_day_info")
    @Expose
    private Object masterDayInfo;
    @SerializedName("for_date")
    @Expose
    private String forDate;
    @SerializedName("dateType")
    @Expose
    private String dateType;
    @SerializedName("total_in_employee")
    @Expose
    private Integer totalInEmployee;
    @SerializedName("date_array")
    @Expose
    private List<String> dateArray = null;
    @SerializedName("attendance_array")
    @Expose
    private List<Integer> attendanceArray = null;
    @SerializedName("pie_chart_array")
    @Expose
    private PieChartArray pieChartArray;
    @SerializedName("total_present")
    @Expose
    private Integer totalPresent;
    @SerializedName("total_late")
    @Expose
    private Integer totalLate;

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

    public String getAvgWorkingHours() {
        return avgWorkingHours;
    }

    public void setAvgWorkingHours(String avgWorkingHours) {
        this.avgWorkingHours = avgWorkingHours;
    }

    public Integer getPendingLeaveTotal() {
        return pendingLeaveTotal;
    }

    public void setPendingLeaveTotal(Integer pendingLeaveTotal) {
        this.pendingLeaveTotal = pendingLeaveTotal;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType;
    }

    public Integer getBioMetricTemOffStaff() {
        return bioMetricTemOffStaff;
    }

    public void setBioMetricTemOffStaff(Integer bioMetricTemOffStaff) {
        this.bioMetricTemOffStaff = bioMetricTemOffStaff;
    }

    public AllAverageTime getAllAverageTime() {
        return allAverageTime;
    }

    public void setAllAverageTime(AllAverageTime allAverageTime) {
        this.allAverageTime = allAverageTime;
    }

    public List<Object> getWhere() {
        return where;
    }

    public void setWhere(List<Object> where) {
        this.where = where;
    }

    public Integer getSpecialDutyTotal() {
        return specialDutyTotal;
    }

    public void setSpecialDutyTotal(Integer specialDutyTotal) {
        this.specialDutyTotal = specialDutyTotal;
    }

    public Integer getLeaveTotal() {
        return leaveTotal;
    }

    public void setLeaveTotal(Integer leaveTotal) {
        this.leaveTotal = leaveTotal;
    }

    public Integer getRegisterStaff() {
        return registerStaff;
    }

    public void setRegisterStaff(Integer registerStaff) {
        this.registerStaff = registerStaff;
    }

    public List<String> getSectionInfoArray() {
        return sectionInfoArray;
    }

    public void setSectionInfoArray(List<String> sectionInfoArray) {
        this.sectionInfoArray = sectionInfoArray;
    }

    public List<Integer> getTotalSectionArray() {
        return totalSectionArray;
    }

    public void setTotalSectionArray(List<Integer> totalSectionArray) {
        this.totalSectionArray = totalSectionArray;
    }

    public List<Integer> getPresentSectionArray() {
        return presentSectionArray;
    }

    public void setPresentSectionArray(List<Integer> presentSectionArray) {
        this.presentSectionArray = presentSectionArray;
    }

    public List<Integer> getAbsentSectionArray() {
        return absentSectionArray;
    }

    public void setAbsentSectionArray(List<Integer> absentSectionArray) {
        this.absentSectionArray = absentSectionArray;
    }

    public String getCalDate() {
        return calDate;
    }

    public void setCalDate(String calDate) {
        this.calDate = calDate;
    }

    public MasterInfodash getMasterInfodash() {
        return masterInfodash;
    }

    public void setMasterInfodash(MasterInfodash masterInfodash) {
        this.masterInfodash = masterInfodash;
    }

    public Integer getCheck() {
        return check;
    }

    public void setCheck(Integer check) {
        this.check = check;
    }

    public Integer getActiveStaff() {
        return activeStaff;
    }

    public void setActiveStaff(Integer activeStaff) {
        this.activeStaff = activeStaff;
    }

    public Integer getAccessOffice() {
        return accessOffice;
    }

    public void setAccessOffice(Integer accessOffice) {
        this.accessOffice = accessOffice;
    }

    public Object getMasterDayInfo() {
        return masterDayInfo;
    }

    public void setMasterDayInfo(Object masterDayInfo) {
        this.masterDayInfo = masterDayInfo;
    }

    public String getForDate() {
        return forDate;
    }

    public void setForDate(String forDate) {
        this.forDate = forDate;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public Integer getTotalInEmployee() {
        return totalInEmployee;
    }

    public void setTotalInEmployee(Integer totalInEmployee) {
        this.totalInEmployee = totalInEmployee;
    }

    public List<String> getDateArray() {
        return dateArray;
    }

    public void setDateArray(List<String> dateArray) {
        this.dateArray = dateArray;
    }

    public List<Integer> getAttendanceArray() {
        return attendanceArray;
    }

    public void setAttendanceArray(List<Integer> attendanceArray) {
        this.attendanceArray = attendanceArray;
    }

    public PieChartArray getPieChartArray() {
        return pieChartArray;
    }

    public void setPieChartArray(PieChartArray pieChartArray) {
        this.pieChartArray = pieChartArray;
    }

    public Integer getTotalPresent() {
        return totalPresent;
    }

    public void setTotalPresent(Integer totalPresent) {
        this.totalPresent = totalPresent;
    }

    public Integer getTotalLate() {
        return totalLate;
    }

    public void setTotalLate(Integer totalLate) {
        this.totalLate = totalLate;
    }

}
