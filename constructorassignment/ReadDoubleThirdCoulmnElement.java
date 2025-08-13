package com.sgtesting.constructorassignment;

class ReadElemet
{

    ReadElemet(double arr[][])
    {
        int i =0;
        do {
            System.out.println(arr[i][2]);
            i++;
        }while (i<3);
    }
}

public class ReadDoubleThirdCoulmnElement
{
    public static void main(String[] args)
    {
        double read [][] ={{1.1, 1.2, 1.3},
                            {2.1, 2.2, 2.3},
                            {3.1, 3.2, 3.3} };
        ReadElemet obj = new ReadElemet(read);
    }
}
