
package com.techndev.attendanceapptd_05.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AllAverageTime {

    @SerializedName("average_in_time")
    @Expose
    private String averageInTime;
    @SerializedName("average_out_time")
    @Expose
    private String averageOutTime;

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

}
