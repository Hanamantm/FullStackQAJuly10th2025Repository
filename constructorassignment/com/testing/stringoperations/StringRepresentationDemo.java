package com.sgtesting.constructorassignment.com.testing.stringoperations;

class Student
{
    String name;
    int age;
    String course;

    Student(String name,int age, String course)
    {
        this.name=name;
        this.age=age;
        this.course=course;
    }

    public String toString()
    {
        return "Student[name= "+name+ ", age ="+age +", course=" +course+")]";
    }
}

public class StringRepresentationDemo
{
    public static void main(String[] args)
    {
        Student obj = new Student("Hanamant", 34, "java");
        System.out.println(obj);
    }
}
