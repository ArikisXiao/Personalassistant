package com.example.personalassistant.ui.view.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: BaseActivity
 * @date :2020/1/1 20:33
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutById());
        initResource();
        initView();
        initListener();
    }

    /**
     * 获取布局xml文件
     */
    public abstract int getLayoutById();

    /** 初始化view*/
    public abstract void initView();
    /** 初始化资源*/
    public abstract void initResource();
    /** 初始化监听器*/
    public abstract void initListener();

}
