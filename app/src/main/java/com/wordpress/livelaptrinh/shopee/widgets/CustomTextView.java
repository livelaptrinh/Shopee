package com.wordpress.livelaptrinh.shopee.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.TextView;

import com.wordpress.livelaptrinh.shopee.R;

import java.time.format.TextStyle;

/**
 * Created by MSI on 6/23/2018.
 */

@SuppressLint("AppCompatCustomView")
public class CustomTextView extends TextView {

    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs);
    }


    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CustomTextView);
        final int size = array.getIndexCount();
        for (int i = 0; i < size; i++) {
            int attr = array.getIndex(i);
            if (attr == R.styleable.CustomTextView_fontName) {
                try {
                    Typeface font = Typeface.createFromAsset(getResources().getAssets(), "fonts/" + array.getString(attr));
                    if (font != null) {
                        this.setTypeface(font);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
