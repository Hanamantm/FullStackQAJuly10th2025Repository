package com.sgtesting.constructorassignment.com.testing.stringoperations;

public class StringBufferOperation
{
    public static void main(String[] args)
    {
        appendDemo();
        insertString();
        deleteString();
        reverseString();
    }

    //StringBuffer is a class in java (java.lang package)
    //It is used to create mutable(changeable) strings.
    //stringBuffer  allows you to modify, append, insert, delete or reverse characters without creating new objects everytime.

    private static void appendDemo()
    {
        StringBuffer sb=new StringBuffer("Java");
        System.out.println("Before append :"+sb);
        sb.append(" Programming"); // it is a method in string buffer class, and it is used to add(append) data at the end of the existing string buffer
        sb.append(" Language");
        System.out.println("after append :"+sb);
        System.out.println("--------------------------------");

    }
    private  static void insertString()
    {
        StringBuffer sb=new StringBuffer("It is a place");
        System.out.println("Before insert :"+sb);
        StringBuffer str= sb.insert(8, "new "); // it is used to insert text or values at a specified position(index) it allows you to add content anywhere in string.
        //sb.insert(17,", The place is Bangalore"); // it includes new added string also so count new string than add position
        System.out.println("After insert :" +str);
        System.out.println("---------------------------");

       /* StringBuffer sb1 = new StringBuffer("marks: ");
        sb1.insert(7, 95); //insert int
        sb1.insert(9, " out of ");//insert string //got exception (StringIndexOutOfBoundsException) when I entered wring index
        sb1.insert(17, 100.00);// insert double
        sb1.insert(sb1.length()," congrats!!");
        System.out.println(sb1);*/

    }

    private static void deleteString()
    {
        StringBuffer sb= new StringBuffer("It is a new palace");
        StringBuffer str=sb.delete(8,12);
        System.out.println("Deleting string : "+str);
        System.out.println("----------------------------");
    }

    private static void  reverseString()
    {
        StringBuffer sb= new StringBuffer("Bangalore");
        StringBuffer rev=sb.reverse();
        System.out.println("Reversing result : "+rev);
    }

}
