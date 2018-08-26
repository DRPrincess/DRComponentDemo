package com.carcomponent;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baseres.BaseActivity;
import com.baseres.router.ArouterConsts;

@Route(path = ArouterConsts.CAR_LIST)
public class CarListActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_activity_car);
    }
}
