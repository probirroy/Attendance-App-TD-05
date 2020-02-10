package com.techndev.attendanceapptd_05.activity;

import androidx.appcompat.app.AppCompatActivity;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.techndev.attendanceapptd_05.R;
import com.techndev.attendanceapptd_05.helper.PrefManager;
import com.techndev.attendanceapptd_05.helper.ShareInfo;
import com.techndev.attendanceapptd_05.model.LoginResponseModel;
import com.techndev.attendanceapptd_05.network.ApiClient;
import com.techndev.attendanceapptd_05.network.ApiInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoginActivity extends AppCompatActivity {
    EditText uName,pWord;
    Button loginBtn;
    String manual_sec_key;

    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        uName=findViewById(R.id.username);
        pWord=findViewById(R.id.password);
        loginBtn=findViewById(R.id.loginBtn);

        prefManager=new PrefManager(LoginActivity.this);

        DateFormat df1 = new SimpleDateFormat("dd");
        String d = df1.format(new Date());
        DateFormat df2 = new SimpleDateFormat("MM");
        String mb = df2.format(new Date());
        DateFormat df3 = new SimpleDateFormat("yyyy");
        String y = df3.format(new Date());
        manual_sec_key = d + "AS" + mb + "GS" + y + "BS";

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String userEmail= uName.getText().toString();
               String password = pWord.getText().toString();

                final RequestBody emailValue = RequestBody.create(MediaType.parse("text/plain"), userEmail);
                final RequestBody passwordValue = RequestBody.create(MediaType.parse("text/plain"), password);
                RequestBody manual_sec_keyValue = RequestBody.create(MediaType.parse("text/plain"), manual_sec_key);

                ApiInterface getApiCallInstance = new ApiClient().getApiClient(ShareInfo.base_url).create(ApiInterface.class);
                Call<LoginResponseModel> apiCall = getApiCallInstance.loginUser(emailValue,passwordValue,manual_sec_keyValue);

                apiCall.enqueue(new Callback<LoginResponseModel>() {
                    @Override
                    public void onResponse(Call<LoginResponseModel> call, Response<LoginResponseModel> response) {
                        String responseCode= String.valueOf(response.code());
                       if (response.isSuccessful()){
                           String token=  response.body().getData().getToken();
                           String roleId = String.valueOf(response.body().getData().getRoleId());
                           String employeeId = String.valueOf(response.body().getData().getAllSession().getEmployeeId());
                           String name= response.body().getData().getAllSession().getName();

                           prefManager.saveLoginInfo(token,roleId,employeeId);

                           startActivity(new Intent(LoginActivity.this,DashboardActivity.class));
                       }else {

                       }
                    }

                    @Override
                    public void onFailure(Call<LoginResponseModel> call, Throwable t) {

                    }
                });


            }
        });
    }
}
