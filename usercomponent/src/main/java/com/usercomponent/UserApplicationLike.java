package com.usercomponent;

import android.app.Application;
import android.util.Log;

import com.baseres.BaseApplication;
import com.baseres.router.IComponentApplication;

/**
 * 模块 Application 接口实现类
 *
 * @author DR
 * @date 2018/8/25
 */

public class UserApplicationLike implements IComponentApplication {

    private static final String TAG = "UserApplicationLike";
    @Override
    public void onCreate(BaseApplication application) {


        Log.d(TAG, "onCreate: UserApplicationLike 创建并初始化");

    }

    @Override
    public Application getAppliaction() {
        return null;
    }
}
