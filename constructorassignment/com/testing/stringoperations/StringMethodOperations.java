package com.sgtesting.constructorassignment.com.testing.stringoperations;

public class StringMethodOperations
{
    public static void main(String[] args)
    {
        String s="welcome";

        //1. length() method - To find the length of string or number of character in string(return type is int)

        System.out.println("find the length of string or number of character in string : "+s.length());
        System.out.println("Welcome".length()); //by using direct value find the length
        int length =s.length();
        System.out.println(length); //another way of finding length

        //2. concat() method - Joining one or more strings by using concat() method or by using (+) operator

        String s1 ="welcome ";
        String s2 = " to Java";
        String s3 = " automation";

        System.out.println(s1+s2); //By using + operator
        System.out.println(s1.concat(s2)); //By using concat method
        System.out.println(s1+s2+s3); //concatenating more strings by using + operator
        System.out.println(s1.concat(s2).concat(s3)); //concatenating more strings by using concat method.

        //3. trim() method -- It removes spaces right and left side in string

        String s4= "   welcome   ";
        System.out.println(s4);
        System.out.println("Before trim "+s4.length());// Before trim length of string
        System.out.println(s4.trim());
        System.out.println("after trim "+s4.trim().length()); //after trim length of string

        //4. CharAt() method --Returns a character from a string based on index. index starts from zero in string also

        String s5 ="welcome";
        System.out.println(s5.charAt(3)); //To extract character from string.
        System.out.println(s5.charAt(0));

        //5. contains() method --returns boolean values , its checked based on character sequence or it checks substring is part of main string or not.
        String s6 ="welcome";
        System.out.println(s6.contains("wel"));//true
        System.out.println(s6.contains("come"));//true
        System.out.println(s6.contains("Wel"));// false bcz its case sensitive.

        //6. equals() and equalIgnorecase() method -- Both methods are used to compare string.

        String s7 = "welcome";
        String s8 = "welcome";

        System.out.println(s7==s8);
        System.out.println(s7.equals(s8));
        System.out.println("Welcome".equals(s7)); //its checking contents so its case-sensitive

        System.out.println(s7.equalsIgnoreCase(s8));
        System.out.println(s7.equalsIgnoreCase("WELCOME"));


        //7. replace () method -- It will replace single/multiple (sequence) of character in string
                                  //public String replace(char oldchar , char newchar )

        //How to replace single character.

        String place ="welcome to selenium python selenium python selenium c#";

        System.out.println(place.replace('e', 'Y')); //replacing single character
        System.out.println(place.replace("selenium", "playwright"));// replacing multiple character

        //8. toUpperCase() & toLowerCase() methods -- converts all characters to uppercase or lowercase.

        String upper ="hanamant";
        System.out.println(upper.toUpperCase());
        String lower ="MUDALAGI";
        System.out.println(lower.toLowerCase());
    }
}
