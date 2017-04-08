package com.midigital.fujitsu.midigital.Parent;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.midigital.fujitsu.midigital.R;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 05/04/2017.
 */

public class SelectHomeworkAdapter  extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private ArrayList<CustomeHomework> dummyData;


    public SelectHomeworkAdapter(Context Contex, ArrayList<CustomeHomework> mDummydata) {

        dummyData = mDummydata;

        mLayoutInflater = LayoutInflater.from(Contex);
    }

    @Override
    public int getCount() {
        return dummyData.size();
    }

    @Override
    public Object getItem(int position) {
        return dummyData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        CustomeHomework custome = (CustomeHomework) getItem(position);
        convertView = mLayoutInflater.inflate(R.layout.selecthomework,parent,false);
        TextView datetext = (TextView) convertView.findViewById(R.id.date_text);
        TextView dayext = (TextView) convertView.findViewById(R.id.day_text);
        TextView subjecttext = (TextView) convertView.findViewById(R.id.subjectcode_text);
        TextView postedbyext = (TextView) convertView.findViewById(R.id.postedby_text);


        datetext.setText(String.valueOf(custome.getDate()));
        dayext.setText(custome.getDay());
        subjecttext.setText(custome.getSubjectcode());
        postedbyext.setText(custome.getPostedby());

        return convertView;
    }
}
