package com.example.personalassistant.ui.view.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/2 18:23
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getLayoutById(), container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
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
