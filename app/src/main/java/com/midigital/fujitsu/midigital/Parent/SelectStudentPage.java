package com.midigital.fujitsu.midigital.Parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Switch;

import com.midigital.fujitsu.midigital.R;

import java.util.ArrayList;

public class SelectStudentPage extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView mstudentlst;
    private StudentSelectAdapter mNameAdapter;

    private ArrayList<CustomeStudent> dummydata;
    int image[] = {R.drawable.logo,R.drawable.bookfirst,R.drawable.booksec,R.drawable.bookthird};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_student_page);

        mstudentlst = (ListView) findViewById(R.id.student_lst);
        dummydata = new ArrayList<>();
        CustomeStudent c1 = new CustomeStudent("Ritesh", "Twelth-C", 00000, "Bhopal",image[0]);
        CustomeStudent c2 = new CustomeStudent("Durgesh", "Twelth-D", 11111, "Patna",image[1]);
        CustomeStudent c3 = new CustomeStudent("Student3", "Twelth-E", 22222, "Sagar",image[2]);
        CustomeStudent c4 = new CustomeStudent("Student4", "Twelth-f", 33333, "Patna",image[3]);

        dummydata.add(c1);
        dummydata.add(c2);
        dummydata.add(c3);
        dummydata.add(c4);


        mNameAdapter = new StudentSelectAdapter(SelectStudentPage.this, dummydata);
        mstudentlst.setAdapter(mNameAdapter);

        mstudentlst.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent studentIntent = new Intent(SelectStudentPage.this, StudentDetail.class);
            for(int i = 0 ; i<=position; i++){
            studentIntent.putExtra("img", image[i]);
        }startActivity(studentIntent);
    }
}