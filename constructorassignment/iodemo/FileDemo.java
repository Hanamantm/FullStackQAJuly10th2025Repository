package com.sgtesting.constructorassignment.iodemo;

import java.io.File;

public class FileDemo
{
    public static void main(String[] args)
    {
        //creating file object passing path as parameter.
        File  f= new File("C:\\demo\\Test\\sample.txt");
        String filename=f.getName();// //it provides the filename
        System.out.println("file name : "+filename);
        File  f1= new File("C:\\demo\\Test");
        String f2=f1.getName(); // it provides the directory name
        System.out.println(f2);
        System.out.println("----------------------------------");

        //Get the name of the parent folder name.;
        String pn= f.getParent(); //it returns parent path as string
        System.out.println("display parent folder name : "+pn);

        //get the parent directory
        File parentDir=f.getParentFile();
        System.out.println("Parent folder directory "+parentDir);

        //get the file path
        String path =f.getAbsolutePath(); //it provides full path.
        System.out.println("Absolute path : "+path);
        String path1 =f.getPath();
        System.out.println("Absolute path1 "+path1);//it also provides full path.

        //verify the folder.

        boolean contains=f.isFile();
        System.out.println("verifying it is file or not :"+contains);

        //verify the directory
        boolean directory=f1.isDirectory(); //it checks the folder only
        System.out.println("verify directory is available or not :" +directory);

        //File permissions
        boolean read =f.canRead(); //it checks the file readable or not
        System.out.println("read permission : "+read);

        boolean write=f.canExecute(); //it checks the file is writable or not
        System.out.println("write permission : "+write);

        boolean execute=f.canExecute();//it checks the file is executable or not.
        System.out.println("Execute permission : "+execute);

        long size= f.length(); // it returns file size in bytes.
        System.out.println("length of file "+size);
    }
}
