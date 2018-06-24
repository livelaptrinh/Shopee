package com.wordpress.livelaptrinh.shopee.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

/**
 * Created by MSI on 6/23/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(getLayoutResID());

        setup();

        initUI();

    }

    private void setup(){
        Logger.addLogAdapter(new AndroidLogAdapter());
    }

    public abstract int getLayoutResID();

    public abstract void initUI();


}
