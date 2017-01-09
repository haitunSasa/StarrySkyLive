package com.starryskylive.ui.login.presenter;


import com.starryskylive.network.request.LoginBean;
import com.starryskylive.ui.login.constract.LoginConstract;

import rx.Subscriber;

/**
 * Created by yubai on 2017/1/3.
 */

public class LoginPresenter extends LoginConstract.Presenter {

    @Override
    public void login(LoginBean bean) {
        mRxManage.add(mModel.login(bean, new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {
                mView.showErrorTip(e.getMessage());

            }

            @Override
            public void onNext(String s) {

                mView.requestSuccess();
            }
        }));
    }
}
