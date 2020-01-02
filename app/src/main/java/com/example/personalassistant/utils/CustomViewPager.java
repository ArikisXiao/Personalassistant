package com.example.personalassistant.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

/**
 * @author xiaosai
 * @email 994975664@qq.com
 * @description: 重写的ViewPager,设置不可滑动
 * @date :2020/1/2 16:34
 */
public class CustomViewPager extends ViewPager {

    private boolean mIsSlidingEnable = true ;

    public CustomViewPager(@NonNull Context context) {
        super(context);
    }

    public CustomViewPager(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.mIsSlidingEnable && super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return this.mIsSlidingEnable && super.onTouchEvent(ev);
    }

    public void setmIsSlidingEnable(boolean mIsSlidingEnable) {
        this.mIsSlidingEnable = mIsSlidingEnable;
    }
}
