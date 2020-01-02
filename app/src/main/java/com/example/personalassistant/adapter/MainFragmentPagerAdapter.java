package com.example.personalassistant.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: main viewpager adapter
 * @date :2020/1/2 18:03
 */
public class MainFragmentPagerAdapter extends FragmentPagerAdapter {

    /**
     * Fragment列
     */
    private List<Fragment> mFragmentList;

    public MainFragmentPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList != null ? mFragmentList.size() : 0 ;
    }

    public void setFragmentList(List<Fragment> fragmentList) {
        mFragmentList = fragmentList;
        notifyDataSetChanged();
    }
}
