package com.sgtesting.constructorassignment;

class ReadElement1
{
    ReadElement1(char ch[])
    {
        int i =ch.length/2;
        while (i<ch.length)
        {

            System.out.print(ch[i] + " ");
            i++;
        }
        System.out.println();
    }
}
public class ReadCharSecondHalfElement
{
    public static void main(String[] args)
    {
        char a[] = {'a','b','c','d','e','f'};
        ReadElement1 read=new ReadElement1(a);
    }
}
