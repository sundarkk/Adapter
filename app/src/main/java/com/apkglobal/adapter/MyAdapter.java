package com.apkglobal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawan on 13-05-2018.
 */

public class MyAdapter extends ArrayAdapter<Data> {

    List<Data> list = new ArrayList<>();
    Context context;

    public MyAdapter(@NonNull Context context, int resource, @NonNull List<Data> objects) {
        super(context, R.layout.item, objects);
        this.context = context;
        this.list = objects;


    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=inflater.inflate(R.layout.item,parent,false);
        TextView tv=view.findViewById(R.id.tv);
        ImageView iv=view.findViewById(R.id.iv);
        tv.setText(list.get(position).getName());
        iv.setImageResource(list.get(position).getImage());
        return view;
    }
}
