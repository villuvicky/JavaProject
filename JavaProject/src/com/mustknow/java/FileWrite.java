package com.mustknow.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String content="Hey";
		String Location="writefile.txt";

		FileWriter fileWriter= new FileWriter(Location);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(content);
		bufferedWriter.close();
	}

}
