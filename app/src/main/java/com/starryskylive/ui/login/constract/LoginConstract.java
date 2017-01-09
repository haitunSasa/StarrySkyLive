package com.starryskylive.ui.login.constract;



import com.starryskylive.network.request.LoginBean;
import com.starryskylive.ui.base.BaseModel;
import com.starryskylive.ui.base.BasePresenter;
import com.starryskylive.ui.base.BaseView;

import rx.Subscriber;
import rx.Subscription;

/**
 * Created by yubai on 2017/1/3.
 */

public interface LoginConstract {

    interface Model extends BaseModel {

        Subscription login(LoginBean bean, Subscriber<String> subscriber);

    }

    interface View extends BaseView {

        //请求成功
        void requestSuccess();

        //请求失败
        void requestError();

    }

    abstract class Presenter extends BasePresenter<View,Model> {

        public abstract void login(LoginBean bean);

    }

}
