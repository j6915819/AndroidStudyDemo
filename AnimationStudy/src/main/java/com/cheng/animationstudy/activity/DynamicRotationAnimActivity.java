package com.cheng.animationstudy.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cheng.animationstudy.customview.DynamicRotationGuideView;

public class DynamicRotationAnimActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_dynamicrotationanim);
        setContentView(new DynamicRotationGuideView(this));
    }

}
