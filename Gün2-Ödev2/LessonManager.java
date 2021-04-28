package com.company;

public class LessonManager {
    public void JoinToLesson(Lesson lesson){

        Lesson[] lessons={lesson};
       /* System.out.println("Dersin İsmi:"+lesson.lessonName);
        System.out.println("Dersin Öğretmeni:"+lesson.lessonerName);
        System.out.println("Dersin Fiyatı:"+lesson.unitPrice);
*/
        for (Lesson i:lessons){
            System.out.println("Dersin İsmi:"+i.lessonName);
            System.out.println("Dersin Öğretmeni:"+i.lessonerName);
            System.out.println("Dersin Fiyatı:"+i.unitPrice);
        }
    }
    public void List(Lesson[] lessons){


    }
}
