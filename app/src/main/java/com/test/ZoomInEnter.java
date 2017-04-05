package com.test;

import android.view.View;

import com.banner.BaseAnimator;
import com.nineoldandroids.animation.Animator;
import com.nineoldandroids.animation.ObjectAnimator;

public class ZoomInEnter extends BaseAnimator {

    public ZoomInEnter() {
        this.mDuration = 200;
    }

    public void setAnimation(View view) {
        this.mAnimatorSet.playTogether(new Animator[]{
                ObjectAnimator.ofFloat(view, "scaleX", new float[]{1.0F, 1.5F}),
                ObjectAnimator.ofFloat(view, "scaleY", new float[]{1.0F, 1.5F})});
    }
}
