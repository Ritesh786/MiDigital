package com.midigital.fujitsu.midigital.Parent;

/**
 * Created by Fujitsu on 05/04/2017.
 */

public class CustomeHomework {

    private long date ;
    private String day;
    private  String subjectcode;
    private String postedby;

    public CustomeHomework(long date, String day, String subjectcode, String postedby) {

        this.date = date;
        this.day = day;
        this.subjectcode = subjectcode;
        this.postedby = postedby;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getSubjectcode() {
        return subjectcode;
    }

    public void setSubjectcode(String subjectcode) {
        this.subjectcode = subjectcode;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }
}
