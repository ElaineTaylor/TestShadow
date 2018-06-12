package com.elaine.testshadow;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;

/**
 * CardView控件
 * 该控件的cardElevation属性——阴影效果
 * 该控件可以往里面放其他的控件
 * <p>
 * FloatingActionButton控件
 * elevation属性——阴影效果
 */
public class OneActivity extends AppCompatActivity {

    private CardView mCvOne;
    private FloatingActionButton mFabOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        initView();
    }

    private void initView() {
        mCvOne = (CardView) findViewById(R.id.cv_one);
        mFabOne = (FloatingActionButton) findViewById(R.id.fab_one);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //setShadow();
    }

    /**
     * 设置阴影
     * java控制阴影
     */
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    private void setShadow() {
        mCvOne.setCardElevation(20);
        mFabOne.setElevation(25);
    }
}
