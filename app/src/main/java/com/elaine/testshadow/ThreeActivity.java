package com.elaine.testshadow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 点九图
 * 通过网站定制需要的背景，设置阴影等内容
 * 制作点九图网址如下：
 * http://inloop.github.io/shadow4android/
 * 注：点九图放在drawable文件夹下面，不要放在mipmap文件夹下面，会有引用报错的情况出现
 */
public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
    }
}
