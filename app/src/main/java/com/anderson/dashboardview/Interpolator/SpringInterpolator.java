package com.anderson.dashboardview.Interpolator;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.animation.BaseInterpolator;

/**
 * Created by User1 on 2016/6/16 0016.
 */

@TargetApi(Build.VERSION_CODES.LOLLIPOP_MR1)
public class SpringInterpolator extends BaseInterpolator {
    private final float mTension;
    public SpringInterpolator() {
        mTension = 0.4f;
    }
    public SpringInterpolator(float tension) {
        mTension = tension;
    }

    @Override
    public float getInterpolation(float input) {
        float result = (float) (Math.pow(2,-10 * input) *
                Math.sin((input - mTension / 4) * (2 * Math.PI)/mTension) + 1);
        return result;
    }
}
