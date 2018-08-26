package com.carcomponent;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.baseres.BaseApplication;
import com.baseres.router.IComponentApplication;

/**
 * 车辆模块 Application 接口实现类
 *
 * @author DR
 * @date 2018/8/25
 */

public class CarApplicationLike implements IComponentApplication {

    private static final String TAG = "CarApplicationLike";

    @Override
    public void onCreate(BaseApplication application) {
        Log.d(TAG, "onCreate: CarApplicationLike 创建并初始化");
    }

    @Override
    public Application getAppliaction() {
        return null;
    }
}
