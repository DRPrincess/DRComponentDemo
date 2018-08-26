package com.baseres.router;

import com.alibaba.android.arouter.facade.template.IProvider;

import io.reactivex.Observable;

/**
 *  用户模块对外方法
 *
 * @author DR
 * @date 2018/8/7
 */

public interface IUserComponentService extends IProvider {


    /**
     * 判断是否登录
     * @return
     */
    boolean isLogin();

    /**
     * 退出登录
     */
    Observable<Boolean> logout();


    /**
     *  登录
     * @param mobile
     * @param code
     */
    Observable<Boolean> login(String mobile, String code);






}
