package com.midigital.fujitsu.midigital.Parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.midigital.fujitsu.midigital.R;

public class StudentDetail extends AppCompatActivity {

    ImageView mstudimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_detail);

        mstudimage = (ImageView) findViewById(R.id.imagestud);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("img", 0);
        mstudimage.setImageResource(intValue);

    }

}