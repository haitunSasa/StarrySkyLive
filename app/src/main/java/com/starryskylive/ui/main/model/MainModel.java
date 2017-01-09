package com.starryskylive.ui.main.model;


import com.starryskylive.network.api.MainMethod;
import com.starryskylive.network.request.MainBean;
import com.starryskylive.ui.main.constract.MainConstract;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by yubai on 2017/1/3.
 */

public class MainModel implements MainConstract.Model {

    @Override
    public Subscription getListDatas(MainBean bean, Subscriber<String> subscriber) {
        return MainMethod.getInstance().getListDatas(bean, subscriber);
    }
}