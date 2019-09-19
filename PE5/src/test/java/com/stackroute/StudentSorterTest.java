package com.stackroute;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static org.junit.Assert.*;

public class StudentSorterTest {

    @Test
    public void compare() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(5, "Ramya", 23));
        list.add(new Student(3, "Arjun", 19));
        list.add(new Student(4, "Sheeva", 25));
        list.add(new Student(2, "Arjun", 38));
        list.add(new Student(1, "Ramya", 23));

        list.sort(new StudentSorter());

        for (Student student :
                list) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
        }
    }
}