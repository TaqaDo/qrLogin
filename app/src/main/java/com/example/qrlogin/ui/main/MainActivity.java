package com.example.qrlogin.ui.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.qrlogin.R;
import com.example.qrlogin.data.local.PreferenceUtils;
import com.example.qrlogin.ui.auth.AuthActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (PreferenceUtils.getUserName().isEmpty()) {
            startActivity(new Intent(this, AuthActivity.class));
        }

    }

}