package com.apkglobal.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Pawan on 13-05-2018.
 */

public class ApkaAdapter extends BaseAdapter {
    List<Data> list;
    Context context;

    public ApkaAdapter(int res,List<Data> list, Context context) {
        this.list = list;
        this.context = context;


    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.item,viewGroup,false);
        TextView tv=view.findViewById(R.id.tv);
        ImageView iv=view.findViewById(R.id.iv);
        tv.setText(list.get(i).getName());
        iv.setImageResource(list.get(i).getImage());
        return view;
    }
}
