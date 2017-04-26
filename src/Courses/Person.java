package Courses;

import java.util.Date;

/**
 * Created by yperekhodko on 26.04.2017.
 */
public class Person {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String birthday;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, String email, String phone) {
        this(name, surname);
        this.email = email;
        this.phone = phone;
    }

    public Person(String name, String surname, String email, String phone, String birthday) {
        this(name, surname);
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "Person (" +
                name +" "+ surname +
                ", e-mail: '" + email + '\'' +
                ", phone: '" + phone + '\'' +
                ", birthday: " + birthday +
                '}';
    }


    public static void main(String[] args) {

        Person a =new Person("Adam", "Smith");
        Person b =new Person("Ted", "Couder","ted@ted.com","+38078945617", "19.01.92");
        System.out.println(a);
        System.out.println(b);
    }
}