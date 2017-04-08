package com.midigital.fujitsu.midigital.Parent;

/**
 * Created by Fujitsu on 29/03/2017.
 */

public class CustomeStudent {


    private String name;
    private String clas;
    private int rolldigit;
    private String place;
    private int image;
    public CustomeStudent() {

    }

    public CustomeStudent(String name,String clas, int rolldigit, String place,int image) {

        this.name = name;
        this.clas = clas;
        this.rolldigit = rolldigit;
        this.place = place;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
    }


    public int getRolldigit() {
        return rolldigit;
    }

    public void setRolldigit(int rolldigit) {
        this.rolldigit = rolldigit;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getImage(){
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}


