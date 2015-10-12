package com.n.holiday.data;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.n.holiday.R;

import java.util.List;

/**
 * 项目名称：Holiday
 * 类描述：节气歌列表适配器
 * 创建人：N
 * 创建时间：2015/9/25 14:37
 *
 * @重庆智捷服务团队 版权所有
 */
public class MusicAdapater extends BaseAdapter{

    private List<String> list;

    //声明上下文对象生成对象
    private LayoutInflater inflater;

    //字体
    Typeface fontFace;


    public MusicAdapater(List<String> list, Context context, Typeface fontFace) {
        this.list = list;
        this.inflater = LayoutInflater.from(context);
        this.fontFace = fontFace;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //获取子布局
        convertView = inflater.inflate(R.layout.music_item, null);
        //获取子布局中的textview控件
        TextView musiceTitle = (TextView) convertView.findViewById(R.id.music_item_tv);

        musiceTitle.setText(list.get(position).toString());
        musiceTitle.setTypeface(fontFace);

        return convertView;
    }
}
