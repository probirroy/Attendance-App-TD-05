
package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PieChartArray {

    @SerializedName("Before 9:00")
    @Expose
    private Integer before900;
    @SerializedName("9:00 - 9:30")
    @Expose
    private Integer _900930;
    @SerializedName("9:30 - 10:00")
    @Expose
    private Integer _9301000;
    @SerializedName("10:00 - 12:00")
    @Expose
    private Integer _10001200;
    @SerializedName("After 12:00")
    @Expose
    private Integer after1200;
    @SerializedName("Special Duty")
    @Expose
    private Integer specialDuty;
    @SerializedName("On Leave")
    @Expose
    private Integer onLeave;
    @SerializedName("Absent")
    @Expose
    private Integer absent;
    @SerializedName("Present")
    @Expose
    private Integer present;

    public Integer getBefore900() {
        return before900;
    }

    public void setBefore900(Integer before900) {
        this.before900 = before900;
    }

    public Integer get900930() {
        return _900930;
    }

    public void set900930(Integer _900930) {
        this._900930 = _900930;
    }

    public Integer get9301000() {
        return _9301000;
    }

    public void set9301000(Integer _9301000) {
        this._9301000 = _9301000;
    }

    public Integer get10001200() {
        return _10001200;
    }

    public void set10001200(Integer _10001200) {
        this._10001200 = _10001200;
    }

    public Integer getAfter1200() {
        return after1200;
    }

    public void setAfter1200(Integer after1200) {
        this.after1200 = after1200;
    }

    public Integer getSpecialDuty() {
        return specialDuty;
    }

    public void setSpecialDuty(Integer specialDuty) {
        this.specialDuty = specialDuty;
    }

    public Integer getOnLeave() {
        return onLeave;
    }

    public void setOnLeave(Integer onLeave) {
        this.onLeave = onLeave;
    }

    public Integer getAbsent() {
        return absent;
    }

    public void setAbsent(Integer absent) {
        this.absent = absent;
    }

    public Integer getPresent() {
        return present;
    }

    public void setPresent(Integer present) {
        this.present = present;
    }

}
