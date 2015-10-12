package com.n.holiday.ui;

/**
 * 项目名称：Holiday
 * 类描述：项目简介
 * 创建人：N
 * 创建时间：2015/9/25
 *
 * @重庆智捷服务团队 版权所有
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;

import org.w3c.dom.Text;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IntroduceActivity extends BaseActivity {

    @Bind(R.id.back)
    ImageView back;

    @Bind(R.id.title)
    TextView title;

    @Override
    protected int bindLayout() {
        return R.layout.activity_introduce;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);
        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "fonts/hwxk.ttf");

        title.setTypeface(fontFace);
    }

    @OnClick(R.id.back)
    public  void click(View view){
        switch (view.getId()){
            case R.id.back:
                finish();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
