package com.sgtesting.constructorassignment.com.testing.stringoperations;

public class StringMethods
{
    public static void main(String[] args)
    {
        lowerCase();
        upperCase();
        strLength();
        isEmptyStr();
        getCharacterByIndex();
        compareStringUsingEquals();
        existanceOfString();
        showCharacters();
        findPosition();
        testValueOf();
        splitString();
    }

    private static void lowerCase()
    {
        String s="WELCOME";
        String lower=s.toLowerCase(); //converts all the character in this string to lowercase its returns string.
        System.out.println("LowerCase : "+lower);
        System.out.println("----------------------------");
    }

    private static void upperCase()
    {
        String s="welcome";
        String upper =s.toUpperCase(); //converts all the character in this string to uppercase
        System.out.println("Upper case :"+upper);
        System.out.println("----------------------------");
    }

    private static void strLength()
    {
        String s="Testing";
        int length=s.length(); //Returns the length of the string it returns int
        System.out.println("length of String :"+length);
        System.out.println("----------------------------");
    }

    private static void isEmptyStr()
    {
        //String s="Hanamant"; // it returns false bcz passing values in string
        String s=new String();
        boolean empty=s.isEmpty(); //it returns boolean value
        System.out.println("empty string :"+empty);
        System.out.println("----------------------------");
    }

    private static void getCharacterByIndex()
    {
        String s = "selenium";
        char index= s.charAt(3); //it returns the single char value at the particular specified index.
        System.out.println("extracted character : "+index);
        System.out.println("----------------------------");
    }

    private static void compareStringUsingEquals()
    {
        String s1 ="SELENIUM";
        String s2 ="Selenium";

        boolean result=s1.equals(s2);// compares the content of two strings. overridden from object class
        System.out.println("comparing two string using equals method :"+result);
        boolean result1=s1.equalsIgnoreCase(s2); //compares the content of two strings ignoring case-sensitive.
        System.out.println("comparing two string using equalsIgnoreCase method :"+result1);
        System.out.println("----------------------------");
    }

    private static void existanceOfString()
    {
        String s ="Bangalore is a capital city of Karnataka";
        boolean starts=s.startsWith("Bangalore");//check whether string starts with given prefix.
                                                 // Checks if the string begins with the given substring.
        System.out.println("starts with Bangalore : "+starts);
        //boolean index=s.startsWith("a", 13);
        //System.out.println(index);
        boolean ends=s.endsWith("Karnataka");//Checks if the string ends with the given substring.
        System.out.println("ends with Karnataka : "+ends);
        boolean contains=s.contains("capital");//check whether a string contains a given sequence of characters.
                                                //Checks if the substring exists anywhere in the string.
        System.out.println("contains capital :"+contains);
        System.out.println("----------------------------");
    }

    private static void showCharacters()
    {
        String s=new String("WELCOME");
        char[] element=s.toCharArray();//converts string into new character array.Each character in the string becomes element.

        for(char k:element)
        {
            System.out.println(k);
        }
        System.out.println("----------------------------");
    }

    private static void findPosition()
    {
        String str = "It is a book, It is on the table";
        int s=str.indexOf("is"); //Returns the index of the first occurrence of a character or substring(it searches from left to right)
        System.out.println("position of is from left occurrence " +s);
        int s2=str.lastIndexOf("is");//Returns the index of the last occurrence of a character or substring(it searches from right to left)
        System.out.println("position of is from right occurrence " +s2);
        System.out.println("----------------------------");
    }

    private static void testValueOf()
    {
        double d=45.75;
        String s= String.valueOf(d);//It is static method, it converts different data types into a string
        System.out.println("converting double to string :"+s);
        boolean flag =true;
        String s1=String.valueOf(flag);
        System.out.println("converting boolean to string :"+s1);
        System.out.println("---------------------------------");

    }

    private static void splitString()
    {
        String str= "Apple,Mango,Banana,Orange,Grapes";
        //splitting by comma
        String words[]= str.split(","); //It is used to split a string into multiple parts based on given delimiter.it returns String array
        for (String val:words)
        {
            System.out.println(val);
        }
        System.out.println("----------------------------");

        //splitting by space
        String str1 =" Java is fun";
        String space[] =str1.split(" ");
        for (String value: space)
        {
            System.out.println(value);
        }
        System.out.println("-------------------------------");

        //split into only 2 parts

        String s="one:two:three:four";
        String  parts[]=s.split(":", 2);
        for (String k:parts)
        {
            System.out.println(k);
        }
        System.out.println("--------------------------------");
        //split when digit appear
        String digit="apple123banana456mango789";
        String d[]=digit.split("\\d+");
        for (String p:d)
        {
            System.out.println(p);
        }
    }
}
