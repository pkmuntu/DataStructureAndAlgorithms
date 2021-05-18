package com.muntu.test;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter {

	public static void main(String[] args) {
		
		try {
			FileWriter fw=new FileWriter("D:/java/test.txt");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
