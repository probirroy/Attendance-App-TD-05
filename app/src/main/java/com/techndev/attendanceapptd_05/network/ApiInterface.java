package com.techndev.attendanceapptd_05.network;

import com.techndev.attendanceapptd_05.model.DashboardResponseModel;
import com.techndev.attendanceapptd_05.model.LoginResponseModel;
import com.techndev.attendanceapptd_05.model.OfficeListResponseModel;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {
    @Multipart
    @POST("Login")
    Call<LoginResponseModel> loginUser(
            @Part("email") RequestBody eamilValue,
            @Part("password") RequestBody passwordValue,
            @Part("manual_sec_key") RequestBody manual_sec_keyValue
    );

    @POST("DashboardInfo")
    @FormUrlEncoded
    Call<DashboardResponseModel> dashboardinfoAll(@Header("Authorization") String token,
                                                 @Field("office_type") String office_type,
                                                 @Field("change_date") String change_date
                                              /*   @Field("ministry_id") String ministry_id,
                                                 @Field("division_id") String division_id,
                                                 @Field("district_id") String district_id,
                                                 @Field("upozila_id") String upozila_id ,
                                                 @Field("master_id") String master_id*/
    );
    @POST("OfficeList")
    @FormUrlEncoded
    Call<OfficeListResponseModel> adminOfficeList(@Header("Authorization") String token,
                                                  @Field("office_type") String office_type,
                                                  @Field("change_date") String change_date
                                                 /* @Field("ministry_id") String ministry_id,
                                                  @Field("division_id") String division_id,
                                                  @Field("district_id") String district_id,
                                                  @Field("upozila_id") String upozila_id ,
                                                  @Field("master_id") String master_id*/
    );
}
