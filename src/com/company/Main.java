package com.company;

public class Main {

    public static void main(String[] args) {
        Lesson lesson1=new Lesson(1,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demirog",0.0);
        Lesson lesson2=new Lesson(2,"Yazılım Geliştirici Yetiştirme Kampı (C#+Angular)","Engin Demirog",0.0);
        Lesson lesson3=new Lesson(3,"Programlamaya Giriş İçin Temel Kurs","Engin Demirog",0.0);

        LessonManager lessonManager=new LessonManager();

        lessonManager.JoinToLesson(lesson1);
        lessonManager.JoinToLesson(lesson2);
        lessonManager.JoinToLesson(lesson3);
    }
}
