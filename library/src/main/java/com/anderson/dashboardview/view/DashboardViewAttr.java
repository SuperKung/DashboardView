package com.anderson.dashboardview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;

import com.anderson.dashboardview.R;
import com.anderson.dashboardview.util.PxUtils;


/**
 * Created by anderson on 2016/6/5.
 */
public class DashboardViewAttr {
    private int mTikeCount;
    private int mTextSize;
    private String mText = "";
    private int progressHeight;
    private String unit ;//单位
    private int textColor;
    private int background;
    private int startColor;
    private int endColor;
    private float startNum;
    private float maxNum;
    private int padding ;
    private int progressColor;

    public DashboardViewAttr(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.DashboardView, defStyleAttr, 0);
        mTikeCount = ta.getInt(R.styleable.DashboardView_tikeCount, 48);
        mTextSize = ta.getDimensionPixelSize(PxUtils.spToPx(R.styleable.DashboardView_android_textSize, context), 24);
        mText = ta.getString(R.styleable.DashboardView_android_text);
//        progressHeight = ta.getInt(PxUtils.dpToPx(R.styleable.DashboardView_progressHeight,context), 20);
        unit = ta.getString(R.styleable.DashboardView_Unit);
        textColor = ta.getColor(R.styleable.DashboardView_textColor, context.getResources().getColor(R.color.textColor));
        background = ta.getColor(R.styleable.DashboardView_backgroundColor,0);
        startColor = ta.getColor(R.styleable.DashboardView_startProgressColor,0);
        endColor = ta.getColor(R.styleable.DashboardView_endProgressColor,0);
        startNum = ta.getInt(R.styleable.DashboardView_startNumber, 0);
        maxNum = ta.getInt(R.styleable.DashboardView_maxNumber, 120);
        padding = ta.getInt(PxUtils.dpToPx(R.styleable.DashboardView_padding,context), 0);
        progressColor = ta.getColor(R.styleable.DashboardView_progressColor,context.getResources().getColor(R.color.skyblue));
        ta.recycle();
    }

    public int getProgressColor() {
        return progressColor;
    }

    public int getPadding() {
        return padding;
    }

    public float getStartNumber() {
        return startNum;
    }

    public float getMaxNumber() {
        return maxNum;
    }

    public int getEndColor() {
        return endColor;
    }

    public int getStartColor() {
        return startColor;
    }

    public int getBackground() {
        return background;
    }

    public int getmTikeCount() {
        return mTikeCount;
    }

    public int getmTextSize() {
        return mTextSize;
    }

    public String getmText() {
        return mText;
    }

//    public int getProgressHeight() {
//        return progressHeight;
//    }

    public String getUnit() {
        return unit;
    }

    public int getTextColor() {
        return textColor;
    }

}
