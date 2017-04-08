package com.midigital.fujitsu.midigital.Parent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.midigital.fujitsu.midigital.MainActivity;
import com.midigital.fujitsu.midigital.R;

import java.util.HashMap;

public class StudentDetail extends AppCompatActivity implements View.OnClickListener, BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener {


    Button mattendace,mhomework,mremark,mfees,mcircular;

    SliderLayout sliderLayout;
    HashMap<String,Integer> Hash_file_maps ;
    Integer Images[]= { R.drawable.bookfirst,R.drawable.booksec,R.drawable.bookthird};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.studenttiles);


        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("img", 0);


        mattendace = (Button) findViewById(R.id.attendance_btn);
        mhomework = (Button) findViewById(R.id.homework_btn);
        mremark = (Button) findViewById(R.id.remark_btn);
        mfees = (Button) findViewById(R.id.fees_btn);
        mcircular = (Button) findViewById(R.id.circular_btn);

        mremark.setOnClickListener(this);
        mhomework.setOnClickListener(this);
        mattendace.setOnClickListener(this);
        mfees.setOnClickListener(this);

        Hash_file_maps = new HashMap<String, Integer>();

        sliderLayout = (SliderLayout)findViewById(R.id.slider);

        Hash_file_maps.put("Student Image", intValue);
        Hash_file_maps.put("Book Image1", Images[0]);
        Hash_file_maps.put("Book Image2", Images[1]);
        Hash_file_maps.put("Book Image3", Images[2]);


        for(String name : Hash_file_maps.keySet()){

            TextSliderView textSliderView = new TextSliderView(StudentDetail.this);
            textSliderView
                    .description(name)
                    .image(Hash_file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);
            sliderLayout.addSlider(textSliderView);
        }
        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        sliderLayout.setCustomAnimation(new DescriptionAnimation());
        sliderLayout.setDuration(3000);
        sliderLayout.addOnPageChangeListener(this);

    }

    @Override
    protected void onStop() {

        sliderLayout.stopAutoCycle();

        super.onStop();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.attendance_btn:
            Intent attendaceint = new Intent(StudentDetail.this, AttendanceSummary.class);
            startActivity(attendaceint);
             break;
            case R.id.homework_btn:
                Intent homeworkint = new Intent(StudentDetail.this, Homework.class);
                startActivity(homeworkint);
                break;
            case R.id.remark_btn:
                Intent remarkint = new Intent(StudentDetail.this, RemarkActivity.class);
                startActivity(remarkint);
                break;
            case R.id.fees_btn:
                Intent feesint = new Intent(StudentDetail.this, FeesActivity.class);
                startActivity(feesint);
                break;
            case R.id.circular_btn:
                Intent circularint = new Intent(StudentDetail.this, CircularActivity.class);
                startActivity(circularint);
                break;


        }
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {

        Intent mIntent = getIntent();
        int intValue = mIntent.getIntExtra("img", 0);

        // Toast.makeText(this,slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
        if(slider.getBundle().get("extra")== "Student Image") {
            Intent fullimageint = new Intent(StudentDetail.this, ShowSlideImage.class);
            fullimageint.putExtra("img",intValue );
            startActivity(fullimageint);
        }
        if(slider.getBundle().get("extra")== "Book Image1") {
            Intent fullimageint = new Intent(StudentDetail.this, ShowSlideImage.class);
            fullimageint.putExtra("img", Images[0]);
            startActivity(fullimageint);
        }
        if(slider.getBundle().get("extra")== "Book Image2") {
            Intent fullimageint = new Intent(StudentDetail.this, ShowSlideImage.class);
            fullimageint.putExtra("img", Images[1]);
            startActivity(fullimageint);
        }
        if(slider.getBundle().get("extra")== "Book Image3") {
            Intent fullimageint = new Intent(StudentDetail.this, ShowSlideImage.class);
            fullimageint.putExtra("img", Images[2]);
            startActivity(fullimageint);
        }


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}