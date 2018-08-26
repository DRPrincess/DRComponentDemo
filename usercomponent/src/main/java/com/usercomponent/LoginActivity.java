package com.usercomponent;

import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.baseres.BaseActivity;
import com.baseres.router.ArouterConsts;

@Route(path = ArouterConsts.USER_LOGIN)
public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity_login);
    }
}
