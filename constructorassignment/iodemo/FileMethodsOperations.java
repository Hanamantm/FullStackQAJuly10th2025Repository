package com.sgtesting.constructorassignment.iodemo;

import java.io.File;

public class FileMethodsOperations
{
    public static void main(String[] args)
    {
        createFolder();
        renameFile();
        deleteFile();
        //fileCollection();
        anotherWayOfFileCollection();
    }

    private static void createFolder()
    {
        File f= new File("C:\\demo\\Test\\welcome.txt");
        try
        {
            if(!f.exists())
            {
                f.createNewFile();
                System.out.println("File is created..");
            }
            else
            {
                System.out.println("file is already created.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void renameFile()
    {
        File f1= new File("C:\\demo\\Test\\welcome.txt");
        File f2= new File("C:\\demo\\Test\\Newwelcome.txt");

        boolean status=f1.renameTo(f2);

        if(status)
        {
            System.out.println("File renamed successfully ..");
        }
        else
        {
            System.out.println("File renamed failed..");
        }
    }

    private static void deleteFile()
    {
        File f= new File("C:\\demo\\Test\\Newwelcome.txt");
        boolean dfile= f.delete();
        System.out.println("File deleted : "+dfile);
    }

    /*private static void fileCollection()
    {
        File file= new File("C:\\demo\\Test");
        File files[] = file.listFiles();

        for (int i=0 ;i<files.length;i++)
        {
            if(files[i].isFile()==true)
            {
                String path =files[i].getAbsolutePath();
                System.out.println(path);
            }
        }
    }*/
    private static void anotherWayOfFileCollection()
    {
        File file= new File("C:\\demo\\Test");
        File files[] = file.listFiles();

        if(files!=null)
        {
            for(File f:files)
            {
                if(f.isFile())
                {
                    System.out.println("File :"+f.getAbsolutePath());
                } else if (f.isDirectory())
                {
                    System.out.println("Directory : "+f.getAbsolutePath());
                }
            }
        }
    }
}
