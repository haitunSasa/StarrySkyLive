package com.starryskylive.ui.login.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import com.starryskylive.R;
import com.starryskylive.network.request.LoginBean;
import com.starryskylive.ui.base.BaseActivity;
import com.starryskylive.ui.login.constract.LoginConstract;
import com.starryskylive.ui.login.model.LoginModel;
import com.starryskylive.ui.login.presenter.LoginPresenter;
import com.starryskylive.ui.main.activity.MainActivity;

import butterknife.Bind;

/**
 * Created by yubai on 2017/1/3.
 */

public class LoginActivity extends BaseActivity<LoginPresenter, LoginModel> implements LoginConstract.View {


    @Bind(R.id.et_input_phone)
    EditText etInputPhone;
    @Bind(R.id.et_input_password)
    EditText etInputPassword;
    @Bind(R.id.btn_login)
    Button btnLogin;

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this, mModel);
    }

    @Override
    public void initView() {

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LoginBean bean = new LoginBean(etInputPhone.getText().toString(), etInputPassword.getText().toString());
                mPresenter.login(bean);
            }
        });
    }

    @Override
    public void requestSuccess() {
        startActivity(new Intent(mContext, MainActivity.class));
    }

    @Override
    public void requestError() {

    }

    @Override
    public void showLoading(String title) {

    }

    @Override
    public void stopLoading() {

    }

    @Override
    public void showErrorTip(String msg) {

        toast(msg);
    }

}
