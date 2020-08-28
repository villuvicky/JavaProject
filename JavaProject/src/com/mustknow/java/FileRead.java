package com.mustknow.java;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String Location="writefile.txt";
		FileReader fileReader=new FileReader(Location);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String currentline;
		while((currentline=bufferedReader.readLine())!=null) {
			System.out.println(currentline);
		}
	}

}
