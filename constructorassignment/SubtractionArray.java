package com.sgtesting.constructorassignment;

class Subtraction
{

    Subtraction(int x[][], int y[][])
    {
        for(int i=0; i<x.length;i++)
        {
            for(int j=0;j<x[i].length;j++)
            {
                int result = (x[i][j]-y[i][j]);
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}

public class SubtractionArray {
    public static void main(String[] args)
    {
        int a[][] ={{10,20},{30,40}};
        int b[][] = {{1,2},{3,4}};
        Subtraction sub=new Subtraction(a,b);
    }
}
