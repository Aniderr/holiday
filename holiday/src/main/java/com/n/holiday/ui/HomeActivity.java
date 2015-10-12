package com.n.holiday.ui;

/**
 * 项目名称：Holiday
 * 类描述：主页
 * 创建人：N
 * 创建时间：2015/9/25 12:49
 *
 * @重庆智捷服务团队 版权所有
 */

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.n.holiday.R;
import com.zg.apps.base.BaseActivity;
import com.zg.apps.utils.ToastUtil;

import net.youmi.android.AdManager;
import net.youmi.android.banner.AdSize;
import net.youmi.android.banner.AdView;
import net.youmi.android.banner.AdViewListener;
import net.youmi.android.onlineconfig.OnlineConfigCallBack;
import net.youmi.android.spot.SpotDialogListener;
import net.youmi.android.spot.SpotManager;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends BaseActivity {


    @Bind(R.id.title)
    TextView title;
    @Bind(R.id.jj)
    ImageView jj;
    @Bind(R.id.jqg)
    ImageView jqg;
    @Bind(R.id.jqys)
    ImageView jqys;
    @Bind(R.id.jq)
    ImageView jq;

    String defaultValue=null;//默认的value，当获取不到在线参数时，会返回该值


    @Override
    protected int bindLayout() {
        return R.layout.activity_home;
    }

    @Override
    protected void bindUIValue(Bundle bundle) {
        ButterKnife.bind(this);

        Typeface fontFace = Typeface.createFromAsset(getAssets(),
                "fonts/hwxk.ttf");

        title.setTypeface(fontFace);

//        showBanner();
//        setSpodAt();
    }

    @OnClick({
            R.id.jj,
            R.id.jqg,
            R.id.jq,
            R.id.jqys,
            R.id.statement
    })
    public void click(View view){
        Intent intent = new Intent();
        switch (view.getId()){
            case R.id.jj:
                startActivity(IntroduceActivity.class);
                break;
            case R.id.jqg:
                startActivity(MusicActivity.class);
                break;
            case R.id.jqys:
                startActivity(RegimenActivity.class);
                break;
            case R.id.jq:
                startActivity(HolidayActivity.class);
                break;
            case R.id.statement:
                startActivity(StatementActivity.class);
                break;
        }
    }

//    private void showBanner() {
//
//        // 实例化LayoutParams(重要)
//        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.WRAP_CONTENT,
//                FrameLayout.LayoutParams.WRAP_CONTENT);
//        // 设置广告条的悬浮位置
//        layoutParams.gravity = Gravity.BOTTOM | Gravity.RIGHT; // 这里示例为右下角
//        // 实例化广告条
//        AdView adView = new AdView(this, AdSize.FIT_SCREEN);
//        // 调用Activity的addContentView函数
//
//        // 监听广告条接口
//        adView.setAdListener(new AdViewListener() {
//
//            @Override
//            public void onSwitchedAd(AdView arg0) {
//                Log.i("YoumiAdDemo", "广告条切换");
//            }
//
//            @Override
//            public void onReceivedAd(AdView arg0) {
//                Log.i("YoumiAdDemo", "请求广告成功");
//            }
//
//            @Override
//            public void onFailedToReceivedAd(AdView arg0) {
//                Log.i("YoumiAdDemo", "请求广告失败");
//            }
//        });
//        ((Activity) this).addContentView(adView, layoutParams);
//    }

//    private void setSpotAd() {
//        // 插播接口调用
//
//        // 加载插播资源
//        SpotManager.getInstance(this).loadSpotAds();
//        // 插屏出现动画效果，0:ANIM_NONE为无动画，1:ANIM_SIMPLE为简单动画效果，2:ANIM_ADVANCE为高级动画效果
//        SpotManager.getInstance(this).setAnimationType(
//                SpotManager.ANIM_ADVANCE);
//        // 设置插屏动画的横竖屏展示方式，如果设置了横屏，则在有广告资源的情况下会是优先使用横屏图。
//        SpotManager.getInstance(this).setSpotOrientation(
//                SpotManager.ORIENTATION_PORTRAIT);
//        Button spotBtn = (Button) findViewById(R.id.showSpot);
//        spotBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                // 展示插播广告，可以不调用loadSpot独立使用
//                SpotManager.getInstance(this).showSpotAds(this,
//                        new SpotDialogListener() {
//                            @Override
//                            public void onShowSuccess() {
//                                Log.i("YoumiAdDemo", "展示成功");
//                            }
//
//                            @Override
//                            public void onShowFailed() {
//                                Log.i("YoumiAdDemo", "展示失败");
//                            }
//
//                            @Override
//                            public void onSpotClosed() {
//                                Log.i("YoumiAdDemo", "展示关闭");
//                            }
//
//                            @Override
//                            public void onSpotClick() {
//                                Log.i("YoumiAdDemo", "插屏点击");
//                            }
//
//                        }); // //
//
//            }
//        });
//    }

    public void setSpodAt(){

        // 展示插播广告，可以不调用loadSpot独立使用

        AdManager.getInstance(this).asyncGetOnlineConfig("95711c7999c05442", new OnlineConfigCallBack() {
            @Override
            public void onGetOnlineConfigSuccessful(String key, String value) {
                //获取在线参数成功

                SpotManager.getInstance(HomeActivity.this).showSpotAds(HomeActivity.this,
                        new SpotDialogListener() {

                            @Override
                            public void onShowSuccess() {

                                Log.i("YoumiAdDemo", "展示成功");
                            }

                            @Override
                            public void onShowFailed() {
                                Log.i("YoumiAdDemo", "展示失败");
                            }

                            @Override
                            public void onSpotClosed() {
                                Log.i("YoumiAdDemo", "展示关闭");
                            }

                            @Override
                            public void onSpotClick() {
                                Log.i("YoumiAdDemo", "展示点击");
                            }

                        }); // //

            }

            @Override
            public void onGetOnlineConfigFailed(String key) {
                // TODO Auto-generated method stub
                //获取在线参数失败，可能原因有：键值未设置或为空、网络异常、服务器异常
            }
        });
    }

}
