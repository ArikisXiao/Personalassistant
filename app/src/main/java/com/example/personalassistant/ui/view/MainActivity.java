package com.example.personalassistant.ui.view;

import android.view.KeyEvent;
import android.widget.Toast;

import com.example.personalassistant.R;
import com.example.personalassistant.ui.view.base.BaseActivity;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description:
 * @date :2020/1/1 22:00
 */
public class MainActivity extends BaseActivity {
    @Override
    public int getLayoutById() {
        return R.layout.activity_main;
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
