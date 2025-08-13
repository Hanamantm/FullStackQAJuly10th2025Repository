package com.sgtesting.constructorassignment;

class ReadElement
{
    String result ="";

    ReadElement(String arr [][])
    {
        for (int i =0; i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        for (int j=0;j<3;j++)
        {
            result+= arr[2][j];
        }
        System.out.println("Concat Result : "+ result);
    }
}


public class StringLasRowOfElement
{
    public static void main(String[] args)
    {
        String concat[][] = {{"Ramesh","Hanamant","Vihaan"},
                              {"Swaroop","Mahesh","Shivaraj"},
                              {"Sameer", "Vikas", "Chetan"}};

        ReadElement read = new ReadElement(concat);
    }
}
