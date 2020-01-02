package com.example.personalassistant.ui.view;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.personalassistant.R;
import com.example.personalassistant.ui.view.base.BaseActivity;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/1 21:20
 */
public class LoginActivity extends BaseActivity {
    private EditText etUserName;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    public int getLayoutById() {
        return R.layout.activity_login;
    }

    @Override
    public void initView() {
        etUserName = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);
    }

    @Override
    public void initResource() {

    }

    @Override
    public void initListener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userame = etUserName.getText().toString();
                String password = etPassword.getText().toString();
                if (userame.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "请输入用户名", Toast.LENGTH_SHORT).show();
                } else if (password.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                } else if (userame.equals("admin") && password.equals("admin")) {
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    LoginActivity.this.startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(LoginActivity.this, "用户名或密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
    private long firstTime = 0;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        long secondTime = System.currentTimeMillis();
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if ( secondTime - firstTime < 2000) {
                System.exit(0);
            } else {
                Toast.makeText(LoginActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                firstTime = System.currentTimeMillis();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
