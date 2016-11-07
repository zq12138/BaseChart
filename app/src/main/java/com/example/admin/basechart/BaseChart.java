package com.example.admin.basechart;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by zq on 2016/11/7.
 */

public class BaseChart extends View{

    private String TAG = "BaseChart";
    public BaseChart(Context context) {
        this(context,null);
    }

    public BaseChart(Context context, AttributeSet attrs) {
        this(context, attrs,R.attr.base_chart_style);
    }

    public BaseChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        this(context, attrs, defStyleAttr,R.style.base_chart_style);
    }

    public BaseChart(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.base_chart_style, defStyleAttr,defStyleRes);
        int n = array.getIndexCount();
        for (int i=0; i<n; i++){
            int attr = array.getIndex(i);
            switch (attr){
                case R.styleable.base_chart_attr1:
                    Log.d(TAG,"attr1 =>" + array.getString(attr));
                    break;
                case R.styleable.base_chart_attr2:
                    Log.d(TAG,"attr2 =>" + array.getString(attr));
                    break;
                case R.styleable.base_chart_attr3:
                    Log.d(TAG,"attr3 =>" + array.getString(attr));
                    break;
                case R.styleable.base_chart_attr4:
                    Log.d(TAG,"attr4 =>" + array.getString(attr));
                    break;
                case R.styleable.base_chart_attr5:
                    Log.d(TAG,"attr5 =>" + array.getString(attr));
                    break;
            }
        }
    }
}
