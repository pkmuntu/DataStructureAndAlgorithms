package com.muntu.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		
		
		
			try {
				File f=new File("D:/java/test.txt");
				FileReader reader=new FileReader(f);
				char[] ch=new char[(int)f.length()];
				reader.read(ch);
				for(char c:ch) {
					System.out.print(c);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
			/*int ele=reader.read();
			while(ele!=-1) {
				System.out.print((char)ele);
				ele=reader.read();*/
		
		

	}

}
