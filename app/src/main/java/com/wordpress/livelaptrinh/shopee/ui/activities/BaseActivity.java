package com.wordpress.livelaptrinh.shopee.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by MSI on 6/23/2018.
 */

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResID());

        initUI();
    }

    public abstract int getLayoutResID();

    public abstract void initUI();
}
