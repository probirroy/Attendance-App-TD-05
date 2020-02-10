package com.techndev.attendanceapptd_05.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    Context context;

    public PrefManager(Context context) {
        this.context = context;
    }

    public void saveLoginInfo(String token, String roleId, String employeeId) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user_token",token);
        editor.putString("user_roleId",roleId);
        editor.putString("user_employeeId",employeeId);
        editor.apply();

    }
    public String getToken() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
        return sharedPreferences.getString("user_token", "");
    }

    public String getRoleId() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
        return sharedPreferences.getString("user_roleId", "");
    }

    public String getEmployeeId() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("user_data", Context.MODE_PRIVATE);
        return sharedPreferences.getString("user_employeeId", "");
    }


}
