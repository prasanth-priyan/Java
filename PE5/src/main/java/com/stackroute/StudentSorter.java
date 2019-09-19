package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        int ageCompare = student2.getAge() - student1.getAge();
        int nameCompare = student2.getName().compareTo(student1.getName());
        int idCompare = student2.getId() - student1.getId();
        if(ageCompare == 0){
            if(nameCompare == 0){
                return idCompare;
            }
            else{
                return nameCompare;
            }
        }
        else {
            return ageCompare;
        }
    }
}
