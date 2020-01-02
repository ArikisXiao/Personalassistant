package com.example.personalassistant.ui.view.fragment;

import com.example.personalassistant.R;
import com.example.personalassistant.ui.view.base.BaseFragment;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/2 18:36
 */
public class WalletFragment extends BaseFragment {
    @Override
    public int getLayoutById() {
        return R.layout.wallet_fragment;
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

    public static WalletFragment newInstance() {
        WalletFragment fragment;
        fragment = new WalletFragment();
        return fragment;
    }
}
