package com.sgtesting.constructorassignment;

class TransposeElement
{
    int trans [][]=new int[3][3];

    TransposeElement(int arr [][])
    {
        System.out.println("Original array");
        for (int i=0;i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(arr[i][j] + " ");

                trans[j][i]=arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Transposed array ");
        for (int i=0; i<3;i++)
        {
            for (int j=0;j<3;j++)
            {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }

    }
}

public class TransposeArray
{
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

        TransposeElement element=new TransposeElement(a);
    }
}
