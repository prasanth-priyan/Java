package com.stackroute;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    User(String firstName, String lastName, int age, double salary){
        this.firstName = firstName;
        this.lastName = lastName;

        if((age<100)&&(age>0)){
            this.age = age;
        }
        else
            this.age = 0;
        this.salary = salary;
    }

    public String getFullName(){
        return firstName + " " + lastName;
    }

    public boolean isValidAge(){
        return ((age>18) && (age<60));
    }
}
