package com.moveit.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NestedView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_view);
    }

    @Override
    protected void onResume() {

        super.onResume();
    }
}
