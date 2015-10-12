package com.n.holiday.ui;


/**
 * 项目名称：Holiday
 * 类描述：节气养生分类页
 * 创建人：N
 * 创建时间：2015/9/25 12:49
 *
 * @重庆智捷服务团队 版权所有
 */

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegimenActivity extends BaseActivity {

    @Bind(R.id.title)
    TextView title;

    @Override
    protected int bindLayout() {
        return R.layout.activity_regimen;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "fonts/hwxk.ttf");
        title.setTypeface(fontFace);

    }

    @OnClick({
            R.id.back,
            R.id.chun1,
            R.id.xia1,
            R.id.qiu1,
            R.id.dong1
    })
    public  void click(View view){

        Bundle bundle = new Bundle();

        switch (view.getId()){

            case R.id.back:
                finish();
                return;
            case R.id.chun1:
                bundle.putInt("key",1);
                break;
            case R.id.xia1:
                bundle.putInt("key",2);
                break;
            case R.id.qiu1:
                bundle.putInt("key",3);
                break;
            case R.id.dong1:
                bundle.putInt("key",4);
                break;
        }

        startActivity(RegimenContentActivity.class, bundle);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
