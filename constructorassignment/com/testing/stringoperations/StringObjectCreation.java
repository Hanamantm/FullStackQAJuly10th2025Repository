package com.sgtesting.constructorassignment.com.testing.stringoperations;

public class StringObjectCreation
{
    public static void main(String[] args)
    {
        //1. creating object of String class new operator with constructor.
        String s = new String("Java");
        System.out.println(s);
        s.concat("Programming");
        System.out.println(s);
        s.concat("Langauage");
        System.out.println(s);

        //2. another way of creating object of String class using String literal.

        String s1="WELCOME";
        System.out.println(s1);
    }
}
