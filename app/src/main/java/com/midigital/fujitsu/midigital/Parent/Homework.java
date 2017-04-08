package com.midigital.fujitsu.midigital.Parent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.midigital.fujitsu.midigital.R;

import java.util.ArrayList;

public class Homework extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView mhomeworklist;

    private SelectHomeworkAdapter mNameAdapter;
    private ArrayList<CustomeHomework> dummydata;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

        mhomeworklist = (ListView) findViewById(R.id.homework_lst);

        dummydata = new ArrayList<>();
        CustomeHomework c1 = new CustomeHomework(512545245,"Monday", "AAAAA","RITESH");
        CustomeHomework c2 = new CustomeHomework(06042017,"Tuesday", "BBBBB","DURGESH");
        CustomeHomework c3 = new CustomeHomework(07/04/2017,"Wednesday", "CCCCC","AAYUSH");
        CustomeHomework c4 = new CustomeHomework(30/04/2017,"Thrusday", "DDDDD","VIJENDRA");

        dummydata.add(c1);
        dummydata.add(c2);
        dummydata.add(c3);
        dummydata.add(c4);


        mNameAdapter = new SelectHomeworkAdapter(Homework.this, dummydata);
        mhomeworklist.setAdapter(mNameAdapter);

        mhomeworklist.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
