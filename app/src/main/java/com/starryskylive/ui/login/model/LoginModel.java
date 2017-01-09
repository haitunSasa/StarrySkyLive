package com.starryskylive.ui.login.model;


import com.starryskylive.network.api.LoginMethod;
import com.starryskylive.network.request.LoginBean;
import com.starryskylive.ui.login.constract.LoginConstract;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by yubai on 2017/1/3.
 */

public class LoginModel implements LoginConstract.Model {

    @Override
    public Subscription login(LoginBean bean, Subscriber<String> subscriber) {
        return LoginMethod.getInstance().login(bean,subscriber);
    }

}
