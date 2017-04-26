package Courses;

import java.util.ArrayList;

/**
 * Created by yperekhodko on 26.04.2017.
 */
//Ім’я;
//        Телефон;
//        Електронна адреса;
//        Опис викладача;
//        Які курси проводить;
//        Які групи;
//        Рейтинг;
//        Скільки виплачено;
//        Заборгованість по оплаті


public class Employee {
    private Person employee;
    private ArrayList <Course> coursesTeach;
    private ArrayList <Group> groupTeach;//Расписать какие преподает предметы вообще и какие в данный момент.
    private String descriptionEmployee;
    private double ratio; //рейтинг преподавателя
    //учет взаиморасчетов - ставка за урок/курс, сколько за период было занятий - сколько положено оплатить и сколько оплатили


}
