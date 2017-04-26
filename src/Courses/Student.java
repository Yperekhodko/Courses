package Courses;

import java.util.ArrayList;

/**
 * Created by yperekhodko on 26.04.2017.
 * Ім’я;
 Телефон;
 Електронна адреса;
 На які курси зареєстрований;
 Скільки вніс коштів;
 Заборгованість по оплаті

 */
public class Student {
    private Person person;
    private ArrayList <Courses> courses; //хранить бы не только курсы но и даты начала обучения. Сюда можно и оплаты подтянуть
    private int paymentMade; //Надо бы учитывать это все в таблице - дату оплаты, дату начисления стоимости когда начал заниматься, дату оплаты. Если студент паралельно на нескольких курсах занимался
    private int debt;



}
