package com.sgtesting.constructorassignment;
class Demo
{
    String str ="";
    Demo(boolean b[])
    {
        for(int i =b.length-1; i>=0;i--)
        {
            str +=b[i];
            System.out.print(str);
        }
    }
}
public class BooleanDemo {
    public static void main(String[] args)
    {
        boolean d [] ={true, false};
        Demo obj= new Demo(d);
    }

}
