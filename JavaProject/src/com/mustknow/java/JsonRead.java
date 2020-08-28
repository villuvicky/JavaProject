package com.mustknow.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		JSONParser jsonParser= new JSONParser();
		FileReader fileReader= new FileReader("myfile-1.json");
		Object jsonboj=jsonParser.parse(fileReader);
		JSONObject jsonObject= (JSONObject) jsonboj;
		String name=(String) jsonObject.get("Name");
		System.out.println(name);
		JSONArray array=(JSONArray) jsonObject.get("Mine");
		Iterator iterator=array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
