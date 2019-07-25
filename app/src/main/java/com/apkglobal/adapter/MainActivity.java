package com.apkglobal.adapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    String [] name={"pawan", "raman","chaman"};
    int [] image={android.R.drawable.alert_dark_frame,
            android.R.drawable.alert_dark_frame,
            android.R.drawable.alert_dark_frame};
    List<Data> dataList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listview);
        dataList.add(new Data(name[0],image[0]));
        dataList.add(new Data(name[1],image[1]));
        dataList.add(new Data(name[2],image[2]));


        /*MyAdapter myAdapter=new MyAdapter(this,R.layout.item, dataList);
        listview.setAdapter(myAdapter);*/
    ApkaAdapter apkaAdapter=new ApkaAdapter(R.layout.item,dataList,this);
    listview.setAdapter(apkaAdapter);
    }
}
