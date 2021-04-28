package com.company;

public class Lesson {

    public Lesson(){

    }
    public Lesson(int id,String lessonName,String lessonerName,double unitPrice){
        this.id=id;
        this.lessonName=lessonName;
        this.lessonerName=lessonerName;
        this.unitPrice=unitPrice;
    }
    int id;
    String lessonName;
    String lessonerName;
    double unitPrice;

}
