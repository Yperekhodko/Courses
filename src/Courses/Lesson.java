package Courses;

//
//Яка група;
//        Місце проведення;
//        Скільки було студентів;
//        Домашнє завдання;
//        Відбулось / не відбулось; - надо ли оно здесь? если не было занятия то объект не будет создан

//        Кількість проведених занять; - это реализовывается где то в списке

//        Кількість запланованих занять; - это реализовывается где то в списке

import java.util.Date;

public class Lesson {
    private Location location;
    private int quantityStudent;
    private String homeTask; //Наверно надо создать объект
    private Date dateLessons;//Дата проведения занятия - надо что бы считать количество лекций за период
    private Employee employee; //Препод который проводил занятие
    private Course course;

}
