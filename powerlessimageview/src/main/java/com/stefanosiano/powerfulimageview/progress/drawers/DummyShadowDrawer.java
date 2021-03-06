package com.stefanosiano.powerfulimageview.progress.drawers;

import android.graphics.Canvas;
import android.graphics.RectF;

import com.stefanosiano.powerfulimageview.progress.ProgressOptions;

/**
 * Dummy progress drawer that doesn't do anything.
 * Used when cancel progress is disabled, so functions can be called without checks with no problem.
 */

final class DummyShadowDrawer implements ShadowDrawer {

    /**
     * Dummy progress drawer that doesn't do anything.
     * Used when cancel progress is disabled, so functions can be called without checks with no problem.
     */
    DummyShadowDrawer() {
    }

    @Override
    public void setup(ProgressOptions progressOptions) {

    }

    @Override
    public void draw(Canvas canvas, RectF shadowBorderBounds, RectF cancelBounds) {

    }
}
