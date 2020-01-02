package com.example.personalassistant.ui.view;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.example.personalassistant.R;
import com.example.personalassistant.adapter.MainFragmentPagerAdapter;
import com.example.personalassistant.ui.view.base.BaseActivity;
import com.example.personalassistant.ui.view.fragment.MessageFragment;
import com.example.personalassistant.ui.view.fragment.NewsFragment;
import com.example.personalassistant.ui.view.fragment.SettingFragment;
import com.example.personalassistant.ui.view.fragment.WalletFragment;
import com.example.personalassistant.utils.CustomViewPager;

import java.util.ArrayList;
import java.util.List;

import static android.util.TypedValue.COMPLEX_UNIT_DIP;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/1 22:00
 */
public class MainActivity extends BaseActivity {
    private BottomNavigationBar bottomNavigationBar;
    private CustomViewPager customViewPager;
    private Toolbar toolbar;
    private TextView tvToolbarTitle;
    @Override
    public int getLayoutById() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        bottomNavigationBar = findViewById(R.id.bottom_navigation_bar_main);
        customViewPager = findViewById(R.id.viewpager_main);
        toolbar = findViewById(R.id.tb_home);
        tvToolbarTitle = findViewById(R.id.tv_main_toolbar);
        initBottomNavigationBar();
        initViewPager();
        initToolBar();
    }

    @Override
    public void initResource() {

    }

    @Override
    public void initListener() {

    }
    private void initToolBar() {
        setSupportActionBar(toolbar);
        //设置不显示App标题
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        tvToolbarTitle.setTextSize(COMPLEX_UNIT_DIP, 18);
    }

    /**
     * 初始化ViewPager，设置ViewPager的相关信息，是否滑动，页面改变等
     */
    private void initViewPager() {
        //viewPager设置不可滑动
        customViewPager.setmIsSlidingEnable(false);
        //设置ViewPager的list：首页、动态、消息、我的
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(MessageFragment.newInstance());
        fragmentList.add(WalletFragment.newInstance());
        fragmentList.add(NewsFragment.newInstance());
        fragmentList.add(SettingFragment.newInstance());
        //设置ViewPager的Adapter
        MainFragmentPagerAdapter mainFragmentPagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager());
        mainFragmentPagerAdapter.setFragmentList(fragmentList);
        customViewPager.setAdapter(mainFragmentPagerAdapter);
        //设置监听
        customViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                bottomNavigationBar.selectTab(position);
                switch (position) {
                    case 0:
                        tvToolbarTitle.setText("事件提醒");
                        break;
                    case 1:
                        tvToolbarTitle.setText("记账本");
                        break;
                    case 2:
                        tvToolbarTitle.setText("新闻");
                        break;
                    case 3:
                        tvToolbarTitle.setText("设置");
                        break;
                    default:
                        tvToolbarTitle.setText("个人助手");
                        break;
                }
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

            @Override
            public void onPageScrollStateChanged(int state) {}
        });
    }

    /**
     * 初始化BottomNavigationBar,设置Bottom Navigation Bar 的 Mode
     * setMode() 内的参数有三种模式类型：
     * MODE_DEFAULT 自动模式：导航栏Item的个数<=3 用 MODE_FIXED 模式，否则用 MODE_SHIFTING 模式
     * MODE_FIXED 固定模式：未选中的Item显示文字，无切换动画效果。
     * MODE_SHIFTING 切换模式：未选中的Item不显示文字，选中的显示文字，有切换动画效果。
     * etBackgroundStyle() 内的参数有三种样式
     * BACKGROUND_STYLE_DEFAULT: 默认样式 如果设置的Mode为MODE_FIXED，将使用BACKGROUND_STYLE_STATIC
     * 如果Mode为MODE_SHIFTING将使用BACKGROUND_STYLE_RIPPLE。
     * BACKGROUND_STYLE_STATIC: 静态样式 点击无波纹效果
     * BACKGROUND_STYLE_RIPPLE: 波纹样式 点击有波纹效果
     */
    private void initBottomNavigationBar() {
        bottomNavigationBar
                .setMode(BottomNavigationBar.MODE_FIXED)
                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_STATIC);
        bottomNavigationBar
                .addItem(new BottomNavigationItem(R.drawable.ic_message, "提醒"))
                .addItem(new BottomNavigationItem(R.drawable.ic_wallet, "账本"))
                .addItem(new BottomNavigationItem(R.drawable.ic_news, "话题"))
                .addItem(new BottomNavigationItem(R.drawable.ic_setting, "设置"))
                .initialise();
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.OnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                customViewPager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(int position) {}

            @Override
            public void onTabReselected(int position) {}
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
                Toast.makeText(MainActivity.this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                firstTime = System.currentTimeMillis();
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


}
