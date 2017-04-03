package com.midigital.fujitsu.midigital.Parent;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.midigital.fujitsu.midigital.R;

import java.util.ArrayList;

/**
 * Created by Fujitsu on 29/03/2017.
 */

public class StudentSelectAdapter extends BaseAdapter {

    private LayoutInflater mLayoutInflater;
    private ArrayList<CustomeStudent> dummyData;

    public StudentSelectAdapter(Context Contex, ArrayList<CustomeStudent> mDummydata) {

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

        CustomeStudent custome = (CustomeStudent) getItem(position);

        convertView = mLayoutInflater.inflate(R.layout.selectstudent,parent,false);

        TextView name = (TextView) convertView.findViewById(R.id.stdent_name);
        TextView claassfix = (TextView) convertView.findViewById(R.id.class_fix);
        TextView claassremote = (TextView) convertView.findViewById(R.id.class_remote);
        TextView rollnofix = (TextView) convertView.findViewById(R.id.rollln0_fix);
        TextView rollnoremote = (TextView) convertView.findViewById(R.id.rolllno_remote);
        TextView nativeplacefix = (TextView) convertView.findViewById(R.id.nativeplace_fix);
        TextView nativeplaceremote = (TextView) convertView.findViewById(R.id.nativeplace_remote);
        CardView studcard = (CardView) convertView.findViewById(R.id.cardview);
        ImageView imagecard = (ImageView) convertView.findViewById(R.id.imageView1);

        name.setText(custome.getName());
        claassremote.setText(custome.getClas());
        rollnoremote.setText(String.valueOf(custome.getRolldigit()));
        nativeplaceremote.setText(custome.getPlace());
        imagecard.setImageResource(custome.getImage());
        return convertView;
    }
}
