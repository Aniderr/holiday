package com.n.holiday.ui;

/**
 * 项目名称：Holiday
 * 类描述：声明
 * 创建人：N
 * 创建时间：2015/9/25 12:49
 *
 * @重庆智捷服务团队 版权所有
 */
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class StatementActivity extends BaseActivity {

    @Bind(R.id.back)
    ImageView back;

    @Override
    protected int bindLayout() {
        return R.layout.activity_statement;

    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);
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
