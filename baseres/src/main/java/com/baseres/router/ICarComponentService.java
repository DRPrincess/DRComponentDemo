package com.baseres.router;

import android.app.Activity;
import android.view.View;

import com.alibaba.android.arouter.facade.template.IProvider;

import io.reactivex.Observable;


/**
 * 车辆模块对外方法
 *
 * @author DR
 * @date 2018/8/7
 */

public interface ICarComponentService extends IProvider {

    /**
     * 获取车辆数目
     * @param userId
     */
    Observable<String> getCarNum(String userId);

    /**
     *  添加浏览记录
     */
    void addFootMark(Object object);



}
