package com.anderson.dashboardview.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

import com.anderson.dashboardview.R;
import com.anderson.dashboardview.util.PxUtils;


/**
 * Created by anderson on 2016/6/5.
 */
public class DashboardViewAttr {
    private int mTextSize;
    private String mText = "";
    private int progressStrokeWidth;
    private String unit;//单位
    private int textColor;
    private int background;
    private int startColor;
    private int endColor;
    private float startNum;
    private float maxNum;
    private int padding;
    private int progressColor;
    private CharSequence[] tikeStrArray;
    private int tikeStrColor;
    private float tikeStrSize;
    private int circleColor;
    public DashboardViewAttr(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.DashboardView, defStyleAttr, 0);
        mTextSize = ta.getDimensionPixelSize(PxUtils.spToPx(R.styleable.DashboardView_android_textSize, context), 24);
        mText = ta.getString(R.styleable.DashboardView_android_text);
        progressStrokeWidth = (int) ta.getDimension(R.styleable.DashboardView_progressStrokeWidth, 24);
        unit = ta.getString(R.styleable.DashboardView_unit);
        textColor = ta.getColor(R.styleable.DashboardView_textColor, context.getResources().getColor(R.color.textColor));
        background = ta.getColor(R.styleable.DashboardView_backgroundColor, 0);
        startColor = ta.getColor(R.styleable.DashboardView_startProgressColor, 0);
        endColor = ta.getColor(R.styleable.DashboardView_endProgressColor, 0);
        startNum = ta.getInt(R.styleable.DashboardView_startNumber, 0);
        maxNum = ta.getInt(R.styleable.DashboardView_maxNumber, 120);
        padding = PxUtils.dpToPx(ta.getInt(R.styleable.DashboardView_padding, 0), context);
        progressColor = ta.getColor(R.styleable.DashboardView_progressColor, context.getResources().getColor(R.color.skyblue));
        tikeStrArray = ta.getTextArray(R.styleable.DashboardView_tikeStrArray);

        tikeStrColor = ta.getColor(R.styleable.DashboardView_tikeStrColor, context.getResources().getColor(android.R.color.black));
        tikeStrSize = ta.getDimension(R.styleable.DashboardView_tikeStrSize, 10);
        circleColor = ta.getColor(R.styleable.DashboardView_centerCircleColor, context.getResources().getColor(R.color.outsideBlue));
        ta.recycle();
    }

    public int getCircleColor() {
        return circleColor;
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

    public int getmTextSize() {
        return mTextSize;
    }

    public String getmText() {
        return mText;
    }

    public int getProgressStrokeWidth() {
        return progressStrokeWidth;
    }

    public String getUnit() {
        return unit;
    }

    public int getTextColor() {
        return textColor;
    }

    public CharSequence[] getTikeStrArray() {
        return tikeStrArray;
    }

    public float getTikeStrSize() {
        return tikeStrSize;
    }

    public int getTikeStrColor() {
        return tikeStrColor;
    }
}
