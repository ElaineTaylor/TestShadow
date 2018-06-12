package com.elaine.testshadow;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * 一般控件
 * elevation属性——阴影效果
 * 这个的概念是相当于3D效果，相当于往Z轴方向移动，然后出现的投影效果
 */
public class TwoActivity extends AppCompatActivity {

    private TextView mTvTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initView();
    }

    private void initView() {
        mTvTwo = (TextView) findViewById(R.id.tv_two);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //setShadow();
    }

    /**
     * 设置阴影效果
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setShadow() {
        mTvTwo.setElevation(30);
    }
}
