package com.midigital.fujitsu.midigital.Parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.midigital.fujitsu.midigital.R;

public class StudentDetail extends AppCompatActivity implements View.OnClickListener {

    ImageView mstudimage;
    Button mattendace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studenttiles);

        mstudimage = (ImageView) findViewById(R.id.imagestud);
        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("img", 0);
        mstudimage.setImageResource(intValue);

        mattendace = (Button) findViewById(R.id.attendance_btn);
        mattendace.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent attendaceint = new Intent(StudentDetail.this,AttendanceSummary.class);
        startActivity(attendaceint);

    }
}