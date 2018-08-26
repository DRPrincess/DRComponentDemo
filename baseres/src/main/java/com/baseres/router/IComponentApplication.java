package com.baseres.router;

import android.app.Application;

import com.baseres.BaseApplication;


/**
 * 组件 APplication 接口
 *
 * @author DR
 * @date 2018/8/21
 */
public interface IComponentApplication {

    void onCreate(BaseApplication application);

    Application getAppliaction();

}
