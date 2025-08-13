package com.sgtesting.constructorassignment;
class Fibonacci
{
    int sum=0;
    Fibonacci()
    {
        int first =0;
        int second =1;

        sum=first+second;
       // System.out.print(first+ " ");
        for(int i =3; i<=10;i++)
        {
            int third =first+second;
            sum=sum+third;
            first=second;
            second=third;
        }
        System.out.println(sum);
    }
}
public class SumOfFirstTenFibonacci
{
    public static void main(String[] args)
    {
        Fibonacci feb= new Fibonacci();
    }
}
