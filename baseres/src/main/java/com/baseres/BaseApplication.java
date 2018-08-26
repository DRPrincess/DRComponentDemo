package com.baseres;
import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.baseres.router.IComponentApplication;
import com.baseres.router.ModuleConfig;

/**
 * 应用基础类
 * @author DR
 * @date 2018/7/19
 */
public class BaseApplication extends Application {


    public synchronized static BaseApplication getInstance() {
        return instante;
    }
    private static BaseApplication instante;


    @Override
    public void onCreate() {
        super.onCreate();
        instante = this;




        //路由初始化
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);




        //Module类的APP初始化
        modulesApplicationInit();




    }

    private void modulesApplicationInit(){
        for (String moduleImpl : ModuleConfig.MODULESLIST){
            try {
                Class<?> clazz = Class.forName(moduleImpl);
                Object obj = clazz.newInstance();
                if (obj instanceof IComponentApplication){
                    ((IComponentApplication) obj).onCreate(BaseApplication.getInstance());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }







}
