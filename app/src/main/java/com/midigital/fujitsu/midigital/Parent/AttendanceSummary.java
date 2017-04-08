package com.midigital.fujitsu.midigital.Parent;

import android.app.DatePickerDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
 import java.util.Date;

//import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.midigital.fujitsu.midigital.R;
import com.roomorama.caldroid.CaldroidFragment;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;

public class AttendanceSummary extends AppCompatActivity {

    EditText mfromdate,mtodate;

//    CompactCalendarView compactCalendarView;
//    private SimpleDateFormat simpleDateFormat =
//
//    Calendar myCalendar;
//    DatePickerDialog.OnDateSetListener date1,date2;

    public final static String
            DIALOG_TITLE = "dialogTitle",
            MONTH = "month",
            YEAR = "year",
            SHOW_NAVIGATION_ARROWS = "showNavigationArrows",
            DISABLE_DATES = "disableDates",
            SELECTED_DATES = "selectedDates",
            MIN_DATE = "minDate",
            MAX_DATE = "maxDate",
            ENABLE_SWIPE = "enableSwipe",
            START_DAY_OF_WEEK = "startDayOfWeek",
            SIX_WEEKS_IN_CALENDAR = "sixWeeksInCalendar",
            ENABLE_CLICK_ON_DISABLED_DATES = "enableClickOnDisabledDates",
            SQUARE_TEXT_VIEW_CELL = "squareTextViewCell",
            THEME_RESOURCE = "themeResource";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_summary);


        CaldroidFragment caldroidFragment = new CaldroidFragment();
        Bundle args = new Bundle();
        Calendar cal = Calendar.getInstance();
        args.putInt(CaldroidFragment.MONTH, cal.get(Calendar.MONTH) + 1);
        args.putInt(CaldroidFragment.YEAR, cal.get(Calendar.YEAR));
        caldroidFragment.setArguments(args);

        FragmentTransaction t = getSupportFragmentManager().beginTransaction();
        t.replace(R.id.calendar1, caldroidFragment);
        t.commit();

//    public void setBackgroundDrawableForDates(HashMap<Date, Drawable> backgroundForDateMap) {
//
//        backgroundForDateMap.put()
//
//
//
//    }

        cal.add(Calendar.DATE, -7);
        Date blueDate = cal.getTime();

        Calendar mycal = Calendar.getInstance();
        mycal.set(Calendar.MONTH , 3);
        mycal.set(Calendar.DATE, 24);
        mycal.set(Calendar.YEAR, 2017);
        Date greenDate = mycal.getTime();

        ColorDrawable blue = new ColorDrawable( ContextCompat.getColor(AttendanceSummary.this, R.color.caldroid_light_red));
    ColorDrawable green = new ColorDrawable(Color.GREEN);
    caldroidFragment.setBackgroundDrawableForDate(blue, greenDate);
    caldroidFragment.setBackgroundDrawableForDate(green,blueDate );

        caldroidFragment.refreshView();


//        mfromdate = (EditText) findViewById(R.id.fromdate_etext);
//        mtodate = (EditText) findViewById(R.id.todate_etext);
//
//        myCalendar = Calendar.getInstance();
//
//        date1 = new DatePickerDialog.OnDateSetListener() {
//
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear,
//                                  int dayOfMonth) {
//                // TODO Auto-generated method stub
//                myCalendar.set(Calendar.YEAR, year);
//                myCalendar.set(Calendar.MONTH, monthOfYear);
//                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                updateLabel();
//
//            }
//
//        };
//        date2 = new DatePickerDialog.OnDateSetListener() {
//
//            @Override
//            public void onDateSet(DatePicker view, int year, int monthOfYear,
//                                  int dayOfMonth) {
//                // TODO Auto-generated method stub
//                myCalendar.set(Calendar.YEAR, year);
//                myCalendar.set(Calendar.MONTH, monthOfYear);
//                myCalendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
//                updateLa();
//
//            }
//
//        };
//
//
//        mfromdate.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View v) {
//                new DatePickerDialog(AttendanceSummary.this, date1, myCalendar
//                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
//                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });
//
//        mtodate.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View v) {
//                new DatePickerDialog(AttendanceSummary.this, date2, myCalendar
//                        .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
//                        myCalendar.get(Calendar.DAY_OF_MONTH)).show();
//            }
//        });
//
//    }
//
//    private void updateLabel() {
//        String myFormat = "MM/dd/yy"; //In which you need put here
//        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
//        mfromdate.setText(sdf.format(myCalendar.getTime()));
//    }
//
//    private void updateLa() {
//        String myFormat = "MM/dd/yy"; //In which you need put here
//        SimpleDateFormat sdf = new SimpleDateFormat(myFormat, Locale.US);
//        mtodate.setText(sdf.format(myCalendar.getTime()));
//    }
//}
    }
}