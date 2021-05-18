package com.muntu.test;

import java.io.File;
import java.io.IOException;

public class FileHandlingTest 
{
    public static void main( String[] args )
    {
      File f=new File("D:/java/test");
   
     File f1=new File(f,"test2.txt");
     String[] s=f.list();
     for(String list:s) {
    	 System.out.println(list);
     }
    }
}
