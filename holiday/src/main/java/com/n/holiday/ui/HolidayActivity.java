package com.n.holiday.ui;

/**
 * 项目名称：Holiday
 * 类描述：二十四节气列表页
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

public class HolidayActivity extends BaseActivity {

    @Bind(R.id.title)
    TextView title;

    @Override
    protected int bindLayout() {
        return R.layout.activity_holiday;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "fonts/hwxk.ttf");
        title.setTypeface(fontFace);

    }

    /**
     * 各项单击相应事件
     * @param view
     */
    @OnClick({
            R.id.back,
            R.id.title,
            R.id.lichun,
            R.id.yushui,
            R.id.jingzhe,
            R.id.chunfen,
            R.id.qingming,
            R.id.guyu,
            R.id.lixia,
            R.id.xiaoman,
            R.id.mangzhong,
            R.id.xiazhi,
            R.id.xiaoshu,
            R.id.dashu,
            R.id.liqiu,
            R.id.chushu,
            R.id.bailu,
            R.id.qiufen,
            R.id.hanlu,
            R.id.shuangjiang,
            R.id.lidong,
            R.id.xiaoxue,
            R.id.daxue,
            R.id.dongzhi,
            R.id.xiaohan,
            R.id.dahan
    })
    public void click(View view){

        Bundle bundle = new Bundle();
        switch (view.getId()){
            case R.id.back:
                finish();
                return;
            case R.id.lichun:
                bundle.putInt("key", 1);
                break;
            case R.id.yushui:
                bundle.putInt("key", 2);
                break;
            case R.id.jingzhe:
                bundle.putInt("key", 3);
                break;
            case R.id.chunfen:
                bundle.putInt("key", 4);
                break;
            case R.id.qingming:
                bundle.putInt("key", 5);
                break;
            case R.id.guyu:
                bundle.putInt("key", 6);
                break;
            case R.id.lixia:
                bundle.putInt("key", 7);
                break;
            case R.id.xiaoman:
                bundle.putInt("key", 8);
                break;
            case R.id.mangzhong:
                bundle.putInt("key", 9);
                break;
            case R.id.xiazhi:
                bundle.putInt("key", 10);
                break;
            case R.id.xiaoshu:
                bundle.putInt("key", 11);
                break;
            case R.id.dashu:
                bundle.putInt("key", 12);
                break;
            case R.id.liqiu:
                bundle.putInt("key", 13);
                break;
            case R.id.chushu:
                bundle.putInt("key", 14);
                break;
            case R.id.bailu:
                bundle.putInt("key", 15);
                break;
            case R.id.qiufen:
                bundle.putInt("key", 16);
                break;
            case R.id.hanlu:
                bundle.putInt("key", 17);
                break;
            case R.id.shuangjiang:
                bundle.putInt("key", 18);
                break;
            case R.id.lidong:
                bundle.putInt("key", 19);
                break;
            case R.id.xiaoxue:
                bundle.putInt("key", 20);
                break;
            case R.id.daxue:
                bundle.putInt("key", 21);
                break;
            case R.id.dongzhi:
                bundle.putInt("key", 22);
                break;
            case R.id.xiaohan:
                bundle.putInt("key", 23);
                break;
            case R.id.dahan:
                bundle.putInt("key", 24);
                break;
        }
        startActivity(HolidayContentActivity.class, bundle);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
