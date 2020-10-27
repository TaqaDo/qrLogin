package com.example.qrlogin.data.network;

import com.example.AuthModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface AuthApi {

    @GET("user")
    Call<AuthModel> getUser(@Header("Authorization") String id);

}
