package com.efarrar.slideanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//https://codinginflow.com/tutorials/android/slide-animation-between-activities

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openActivity2(View v) {
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
        //Not used because we usd the global config in styles.xml
       // overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
