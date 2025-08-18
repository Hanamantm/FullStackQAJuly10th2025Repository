package com.sgtesting.constructorassignment.com.testing.stringoperations;

public class StringBuilderOperation
{
    public static void main(String[] args)
    {
        appendDemo();
        insertString();
        deleteString();
        reverseString();
    }

    private static void appendDemo()
    {
        StringBuilder sb=new StringBuilder("Software");
        System.out.println("Before append " +sb);
        sb.append(" Testing");
        System.out.println("after append "+ sb);
        System.out.println("-----------------------------");
    }

    private static void insertString()
    {
        StringBuilder sb = new StringBuilder("It is a palace");
        StringBuilder str= sb.insert(8, "new ");
        System.out.println("insert new substring :"+str);
        System.out.println("-------------------------------");
    }

    private static void deleteString()
    {
        StringBuilder sb = new StringBuilder("It is a new palace");
        StringBuilder str=sb.delete(8,12);
        System.out.println("deleting substring :" +str);
    }

    private static void reverseString()
    {
        StringBuilder sb= new StringBuilder("Welcome");
        StringBuilder str =sb.reverse();
        System.out.println("After reverse :"+str);
    }
}
