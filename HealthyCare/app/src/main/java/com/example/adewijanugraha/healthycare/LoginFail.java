package com.example.adewijanugraha.healthycare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.io;

public class LoginFail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_fail);
    }

    public void back (View view){
        Intent intent = new Intent (this, Login.class);
        startActivity(intent);
        finish();
    }
}
