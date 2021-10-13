package com.buntol.bankodayi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class VIPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i_p);
    }

    public void geriClicked(){
        Intent intentToGeri = new Intent(VIPActivity.this,FeedActivity.class);
        startActivity(intentToGeri);

    }
}