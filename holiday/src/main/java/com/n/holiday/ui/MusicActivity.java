package com.n.holiday.ui;


/**
 * 项目名称：Holiday
 * 类描述：节气歌列表页
 * 创建人：N
 * 创建时间：2015/9/25 12:49
 *
 * @重庆智捷服务团队 版权所有
 */

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.n.holiday.R;
import com.n.holiday.data.MusicAdapater;
import com.zg.apps.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MusicActivity extends BaseActivity {

    @Bind(R.id.title)
    TextView title;

    @Bind(R.id.back)
    ImageView back;

    @Bind(R.id.music1)
    ImageView music1;

    @Bind(R.id.music2)
    ImageView music2;

    @Bind(R.id.music3)
    ImageView music3;

    @Bind(R.id.music4)
    ImageView music4;

    @Bind(R.id.music5)
    ImageView music5;

    @Bind(R.id.music6)
    ImageView music6;

    @Bind(R.id.music7)
    ImageView music7;

    @Override
    protected int bindLayout() {
        return R.layout.activity_music;
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
            R.id.music1,
            R.id.music2,
            R.id.music3,
            R.id.music4,
            R.id.music5,
            R.id.music6,
            R.id.music7
    })
    public  void click(View view){


        Bundle bundle = new Bundle();
        switch (view.getId()){
            case R.id.back:
                finish();
                return;
            case R.id.music1:
                bundle.putInt("key", 1);
                break;
            case R.id.music2:
                bundle.putInt("key", 2);
                break;
            case R.id.music3:
                bundle.putInt("key", 3);
                break;
            case R.id.music4:
                bundle.putInt("key",4);
                break;
            case R.id.music5:
                bundle.putInt("key", 5);
                break;
            case R.id.music6:
                bundle.putInt("key", 6);
                break;
            case R.id.music7:
                bundle.putInt("key", 7);
                break;
        }
        startActivity(MusicContentActivity.class, bundle);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
