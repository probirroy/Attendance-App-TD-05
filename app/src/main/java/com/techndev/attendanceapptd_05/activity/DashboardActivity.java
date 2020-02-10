package com.techndev.attendanceapptd_05.activity;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.techndev.attendanceapptd_05.R;
import com.techndev.attendanceapptd_05.helper.PrefManager;
import com.techndev.attendanceapptd_05.helper.ShareInfo;
import com.techndev.attendanceapptd_05.model.DashboardResponseModel;
import com.techndev.attendanceapptd_05.model.LoginResponseModel;
import com.techndev.attendanceapptd_05.network.ApiClient;
import com.techndev.attendanceapptd_05.network.ApiInterface;

public class DashboardActivity extends AppCompatActivity {
    PrefManager prefManager;
    TextView ofc,ofcNo;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        prefManager=new PrefManager(this);
        ofc=findViewById(R.id.officeName);
        ofcNo=findViewById(R.id.adminOfficeValue);
        linearLayout=findViewById(R.id.layoutOffice);

        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DashboardActivity.this, OfficeActivity.class));
            }
        });


        getDashboardInfo();
    }

    private void getDashboardInfo() {
        ApiInterface getApiCallInstance = new ApiClient().getApiClient(ShareInfo.base_url).create(ApiInterface.class);
        Call<DashboardResponseModel> apiCall = getApiCallInstance.dashboardinfoAll("Bearer " +prefManager.getToken(),"1","24/1/2020");

        apiCall.enqueue(new Callback<DashboardResponseModel>() {
            @Override
            public void onResponse(Call<DashboardResponseModel> call, Response<DashboardResponseModel> response) {
                String responseCode= String.valueOf(response.code());
                Log.e("responseCode",responseCode);
                if (response.isSuccessful()){

                    String orgName= response.body().getDashboradInfo().getMasterInfodash().getOrganizationName();
                    ofc.setText(orgName);

                    String ofcNoo= String.valueOf(response.body().getDashboradInfo().getAccessOffice());
                    ofcNo.setText(ofcNoo);

                }else {

                }
            }

            @Override
            public void onFailure(Call<DashboardResponseModel> call, Throwable t) {
                Log.e("ServerDataModel Fail: ", t.getLocalizedMessage());

            }
        });

    }
}
