package com.techndev.attendanceapptd_05.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;

import com.techndev.attendanceapptd_05.R;
import com.techndev.attendanceapptd_05.adapter.OfficeListRecyclerAdapter;
import com.techndev.attendanceapptd_05.helper.PrefManager;
import com.techndev.attendanceapptd_05.helper.ShareInfo;
import com.techndev.attendanceapptd_05.listener.ItemClcikListener;
import com.techndev.attendanceapptd_05.model.DashboardResponseModel;
import com.techndev.attendanceapptd_05.model.OfficeListDataModel;
import com.techndev.attendanceapptd_05.model.OfficeListResponseModel;
import com.techndev.attendanceapptd_05.network.ApiClient;
import com.techndev.attendanceapptd_05.network.ApiInterface;

import java.util.ArrayList;
import java.util.List;

public class OfficeActivity extends AppCompatActivity implements ItemClcikListener {
    PrefManager prefManager;
    List<OfficeListDataModel> dataModelList;

    OfficeListRecyclerAdapter recyclerAdapter;

    RecyclerView recyclerView;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);
        prefManager=new PrefManager(this);

        recyclerView=findViewById(R.id.olist_staff_recycler);
        dataModelList=new ArrayList<>();

        recyclerAdapter=new OfficeListRecyclerAdapter(this,dataModelList);

        recyclerView.setLayoutManager(new GridLayoutManager(this, 1, Configuration.ORIENTATION_PORTRAIT, false));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerAdapter.setItemClickListener(this);
        recyclerView.setAdapter(recyclerAdapter);


        getDashboardInfo();
    }
    private void getDashboardInfo() {
        ApiInterface getApiCallInstance = new ApiClient().getApiClient(ShareInfo.base_url).create(ApiInterface.class);
        Call<OfficeListResponseModel> apiCall = getApiCallInstance.adminOfficeList("Bearer " +prefManager.getToken(),"1","24/1/2020");

        apiCall.enqueue(new Callback<OfficeListResponseModel>() {
            @Override
            public void onResponse(Call<OfficeListResponseModel> call, Response<OfficeListResponseModel> response) {
                String responseCode= String.valueOf(response.code());
                Log.e("responseCodeOfc",responseCode);
                if (response.isSuccessful()){
                    dataModelList.addAll(response.body().getOfficeList());
                    recyclerAdapter.notifyDataSetChanged();
                }else {

                }
            }

            @Override
            public void onFailure(Call<OfficeListResponseModel> call, Throwable t) {
                Log.e("ServerDataModel Fail: ", t.getLocalizedMessage());

            }
        });

    }

    @Override
    public void onItemClick(int position) {
        startActivity(new Intent(this, OfficeDetailsActivity.class)
                .putExtra("id", dataModelList.get(position).getMaster_id()));
//        Intent go = new Intent(this, OfficeDetailsActivity.class);
//        this.startActivity(go);

    }
}
