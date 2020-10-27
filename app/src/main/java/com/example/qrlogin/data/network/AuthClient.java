package com.example.qrlogin.data.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AuthClient {
    private static AuthApi androidApi;

    public static AuthApi getClient(){
        if (androidApi == null){
            androidApi = retrofitBuilder();
        }else {
            return androidApi;
        }
        return androidApi;
    }

    public static AuthApi retrofitBuilder(){
        return new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(AuthApi.class);
    }

}
