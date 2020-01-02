package com.example.personalassistant.ui.view.fragment;

import com.example.personalassistant.R;
import com.example.personalassistant.ui.view.base.BaseFragment;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/2 18:34
 */
public class MessageFragment extends BaseFragment {
    @Override
    public int getLayoutById() {
        return R.layout.message_fragment;
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

    public static MessageFragment newInstance() {
        MessageFragment fragment;
        fragment = new MessageFragment();
        return fragment;
    }
}
