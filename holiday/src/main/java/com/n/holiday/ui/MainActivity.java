package com.n.holiday.ui;

/**
 * 项目名称：Holiday
 * 类描述：启动页
 * 创建人：N
 * 创建时间：2015/9/25 12:49
 *
 * @重庆智捷服务团队 版权所有
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;

import net.youmi.android.AdManager;

import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {

    @Override
    protected int bindLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        AdManager.getInstance(this).init("95711c7999c05442", "347da1a3c4118535", false);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,
                        HomeActivity.class);
                startActivity(intent);
                finish();
            }

        }, 3000);

    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
