package com.sgtesting.constructorassignment.stringmethodsassignment;

public class StringAssignments
{
    public static void main(String[] args)
    {
        findLengthOfString();
        reverseStringWithoutReverseMethod();
        isPalindrome();
        displayDays();
        deleteDay();
    }

    private static void findLengthOfString()
    {
        String s="Testing";

        int count =0;
        char ch[] =s.toCharArray();//this method converts string to new character array.
        for (int k:ch) //[T,e,s,t,i,n,g]
        {
            count++;
        }
        System.out.println(count);
    }

    private static void reverseStringWithoutReverseMethod()
    {
        String s="welcome";
        String reverse="";

        //Using charAt() method reverse given string
        for(int i =s.length()-1;i>=0;i--)
        {
            reverse=reverse+s.charAt(i); //it returns the char value at specified index.
        }

        System.out.println("reversed using charAt() method : " +reverse);

        //Using subString() method reverse given string
        String revSubString ="";
        for (int i=s.length()-1;i>=0;i--)
        {
            revSubString=revSubString+s.substring(i,i+1);
        }
        System.out.println("reversed using subString() method "+revSubString);

        //using toCharArray() method reverse the given string.

        char ch[]=s.toCharArray(); //this method converts string into new character array.

        String reverseToCharArray="";

        for(int i=ch.length-1;i>=0;i--)
        {
            reverseToCharArray +=ch[i];
        }
        System.out.println("reversed using toCharArray() method "+reverseToCharArray );
    }

    private static void isPalindrome()
    {

        String p="kayak";

        String reverse="";
        for(int i=p.length()-1;i>=0;i--)
        {
            reverse=reverse+p.charAt(i); //returns the char value at the specified index.
        }

        if(p.equals(reverse))
        {
            System.out.println(p+ " is a palindrome ..");
        }
        else
        {
            System.out.println(p + " is no palindrome..");
        }
    }

    private static void displayDays()
    {
        String days="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String result=days.replace("DAY", "DAY,");
        System.out.println(result);
    }

    private static void deleteDay()
    {
        String days="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
        String delete=days.replace("DAY","");
        System.out.println(delete);
    }
}
