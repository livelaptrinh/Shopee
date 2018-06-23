package com.wordpress.livelaptrinh.shopee.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
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
    }

    public CustomTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        setTypeface(getTypefaceFromName(context, attrs));
    }


    private Typeface getTypefaceFromName(Context context, AttributeSet attrs) {
        String fontName = attrs.getAttributeName(R.attr.fontName);
        Typeface tf = Typeface.defaultFromStyle(Typeface.NORMAL);
        if (!fontName.isEmpty()) {
            tf = Typeface.createFromAsset(context.getAssets(), "fonts/" + fontName);
        }
        return tf;
    }

}
