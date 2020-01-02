package com.example.personalassistant.ui.view.fragment;

import com.example.personalassistant.R;
import com.example.personalassistant.ui.view.base.BaseFragment;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/2 18:36
 */
public class SettingFragment extends BaseFragment {
    @Override
    public int getLayoutById() {
        return R.layout.setting_fragment;
    }

    @Override
    public void initView() {

    }

    @Override
    public void initResource() {

    }

    @Override
    public void initListener() {

    }

    public static SettingFragment newInstance() {
        SettingFragment fragment;
        fragment = new SettingFragment();
        return fragment;
    }
}
