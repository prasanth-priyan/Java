package com.stackroute;

class Member{
    private String name;
    private int age;
    private double salary;

    Member(){
        name="Harry";
        age=25;
        salary=2500.3;
    }
    Member(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    void getOutput(){
        System.out.println("Output:");
        System.out.println("Member name: "+this.name);
        System.out.println("Member age: "+this.age);
        System.out.println("Member salary: "+this.salary);
    }
}


public class MemberVariable {
    private Member m1;
    MemberVariable(){
        m1=new Member();
        m1.getOutput();
    }
    MemberVariable(String name,int age,double salary){
        m1=new Member(name,age,salary);
        m1.getOutput();
    }
}
