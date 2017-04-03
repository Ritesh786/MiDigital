package com.midigital.fujitsu.midigital;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.midigital.fujitsu.midigital.Parent.ParentLoginPage;
import com.midigital.fujitsu.midigital.Parent.ShowSlideImage;
import com.midigital.fujitsu.midigital.Teacher.TeacherLoginPage;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

       Button mlginparent,mlginteacher;

    boolean doubleBackToExitPressedOnce = false;

    SliderLayout sliderLayout;
    HashMap<String,Integer> Hash_file_maps ;
    Integer Images[]= {R.drawable.logo, R.drawable.bookfirst,R.drawable.booksec,R.drawable.bookthird};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mlginparent = (Button) findViewById(R.id.lgin_parent);
        mlginteacher = (Button) findViewById(R.id.lgin_teacher);
        mlginparent.setOnClickListener(this);
        mlginteacher.setOnClickListener(this);

//        Hash_file_maps = new HashMap<String, Integer>();
//
//        sliderLayout = (SliderLayout)findViewById(R.id.slider);
//
//        Hash_file_maps.put("Mi_Digital Logo", Images[0]);
//        Hash_file_maps.put("Book Image1", Images[1]);
//        Hash_file_maps.put("Book Image2", Images[2]);
//        Hash_file_maps.put("Book Image3", Images[3]);
//
//
//        for(String name : Hash_file_maps.keySet()){
//
//            TextSliderView textSliderView = new TextSliderView(MainActivity.this);
//            textSliderView
//                    .description(name)
//                    .image(Hash_file_maps.get(name))
//                    .setScaleType(BaseSliderView.ScaleType.Fit)
//                    .setOnSliderClickListener(this);
//            textSliderView.bundle(new Bundle());
//            textSliderView.getBundle()
//                    .putString("extra",name);
//            sliderLayout.addSlider(textSliderView);
//        }
//        sliderLayout.setPresetTransformer(SliderLayout.Transformer.Accordion);
//        sliderLayout.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
//        sliderLayout.setCustomAnimation(new DescriptionAnimation());
//        sliderLayout.setDuration(3000);
//        sliderLayout.addOnPageChangeListener(this);

    }

//    @Override
//    protected void onStop() {
//
//        sliderLayout.stopAutoCycle();
//
//        super.onStop();
//    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){

            case R.id.lgin_parent:
                Intent parentintent = new Intent(MainActivity.this, ParentLoginPage.class);
                startActivity(parentintent);
                break;

            case R.id.lgin_teacher:
                Intent teacherintent = new Intent(MainActivity.this, TeacherLoginPage.class);
                startActivity(teacherintent);
                break;

            default:
                break;

        }

    }

//    @Override
//    public void onSliderClick(BaseSliderView slider) {
//
//       // Toast.makeText(this,slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
//        if(slider.getBundle().get("extra")== "Mi_Digital Logo") {
//            Intent fullimageint = new Intent(MainActivity.this, ShowSlideImage.class);
//            fullimageint.putExtra("img", Images[0]);
//            startActivity(fullimageint);
//        }
//        if(slider.getBundle().get("extra")== "Book Image1") {
//            Intent fullimageint = new Intent(MainActivity.this, ShowSlideImage.class);
//            fullimageint.putExtra("img", Images[1]);
//            startActivity(fullimageint);
//        }
//        if(slider.getBundle().get("extra")== "Book Image2") {
//            Intent fullimageint = new Intent(MainActivity.this, ShowSlideImage.class);
//            fullimageint.putExtra("img", Images[2]);
//            startActivity(fullimageint);
//        }
//        if(slider.getBundle().get("extra")== "Book Image3") {
//            Intent fullimageint = new Intent(MainActivity.this, ShowSlideImage.class);
//            fullimageint.putExtra("img", Images[3]);
//            startActivity(fullimageint);
//        }
//
//    }

//    @Override
//    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//    }
//
//    @Override
//    public void onPageSelected(int position) {
//
//        Log.d("Slider Demo", "Page Changed: " + position);
//
//    }
//
//    @Override
//    public void onPageScrollStateChanged(int state) {
//
//    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press Again To Close Application", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }
}
