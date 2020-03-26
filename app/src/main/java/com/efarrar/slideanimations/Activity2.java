package com.efarrar.slideanimations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }


    public void openActivity3(View v) {
        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);
    }

    /** Not called because we used the global config in styles.xml
    public void finish(){
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
    }
     */
}
