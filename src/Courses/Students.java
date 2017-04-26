package Courses;

import java.util.ArrayList;

/**
 * Created by yperekhodko on 26.04.2017.
 */
public class Students {
    private ArrayList <Student> students;

    public void add (Student student) {
      //Надо проверить на дублирование
        students.add(student);
    }
}
