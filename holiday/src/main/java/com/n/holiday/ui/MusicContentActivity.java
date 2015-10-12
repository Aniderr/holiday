package com.n.holiday.ui;


/**
 * 项目名称：Holiday
 * 类描述：节气歌内容页
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

public class MusicContentActivity extends BaseActivity {

    @Bind(R.id.back)
    ImageView back;

    @Bind(R.id.music1)
    View music1;

    @Bind(R.id.music2)
    View music2;

    @Bind(R.id.music3)
    View music3;

    @Bind(R.id.music4)
    View music4;

    @Bind(R.id.music5)
    View music5;

    @Bind(R.id.music6)
    View music6;

    @Bind(R.id.music7)
    View music7;

    @Override
    protected int bindLayout() {
        return R.layout.activity_music_content;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        int key = getIntent().getExtras().getInt("key");

        switch (key){
            case 1:
                music1.setVisibility(View.VISIBLE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.GONE);
                break;
            case 2:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.VISIBLE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.GONE);
                break;
            case 3:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.VISIBLE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.GONE);
                break;
            case 4:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.VISIBLE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.GONE);
                break;
            case 5:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.VISIBLE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.GONE);
                break;
            case 6:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.VISIBLE);
                music7.setVisibility(View.GONE);
                break;
            case 7:
                music1.setVisibility(View.GONE);
                music2.setVisibility(View.GONE);
                music3.setVisibility(View.GONE);
                music4.setVisibility(View.GONE);
                music5.setVisibility(View.GONE);
                music6.setVisibility(View.GONE);
                music7.setVisibility(View.VISIBLE);
                break;
        }
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
