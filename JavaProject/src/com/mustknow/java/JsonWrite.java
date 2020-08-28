package com.mustknow.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		JSONObject jsonObject= new JSONObject();
		jsonObject.put("Name", "Vicky k");
		JSONArray array= new JSONArray();
		array.add("Hey Man");
		jsonObject.put("Mine",array);
		FileWriter fileWriter= new FileWriter("myfile-1.json");
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write(jsonObject.toJSONString());
		bufferedWriter.close();
	}

}
