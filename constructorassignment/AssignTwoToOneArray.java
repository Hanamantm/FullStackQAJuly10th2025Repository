package com.sgtesting.constructorassignment;

class AssignTwoToOne
{
    int oneD[] = new int[9];
    AssignTwoToOne(int arr[][])
    {
        int k=0;  //1D array index starts from 0.
        for (int i=0;i<3;i++)
        {
            for (int j=0; j<3; j++)
            {
                oneD[k]=arr[i][j];
                k++;
               // System.out.println("index :" +k);
            }
        }
        for(int i=0; i<oneD.length;i++)
        {
            System.out.print(oneD[i] + " ");
        }
        System.out.println();
    }
}

public class AssignTwoToOneArray
{
    public static void main(String[] args)
    {
        int a [][] ={{10, 20, 30},
                     {40, 50 ,60},
                     {70, 80, 90}};

        AssignTwoToOne obj = new AssignTwoToOne(a);
    }

}
