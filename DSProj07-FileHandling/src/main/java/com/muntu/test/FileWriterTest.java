package com.muntu.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("D:/java/test.txt");
		    fw.write('p');
		    fw.write("\n");
		    fw.write("We are doing File Handling");
		    fw.write("\n");
		    char[] ch = {'p','k','m','n','t','u'};
		    fw.write(ch);
		    fw.write("\n");
		    fw.flush();
		    System.out.println(fw);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
