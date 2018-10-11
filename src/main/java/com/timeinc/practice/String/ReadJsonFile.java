package com.timeinc.practice.String;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJsonFile {
	
	public static void main(String[] args) throws org.json.simple.parser.ParseException, FileNotFoundException, IOException {
		
		JSONParser parser = new JSONParser();
		
		JSONArray a = (JSONArray) parser.parse(new FileReader("C:\\Users\\pradhant\\workspace\\practiceTest\\src\\main\\java\\RequiredFile\\JsonFile.json"));

		  for (Object o : a)
		  {
		    JSONObject person = (JSONObject) o;

		    String name = (String) person.get("name");
		    System.out.println(name);

		    String city = (String) person.get("city");
		    System.out.println(city);

		    String job = (String) person.get("job");
		    System.out.println(job);

		    JSONArray cars = (JSONArray) person.get("cars");

		    for (Object c : cars)
		    {
		      System.out.println(c+"");
		    }
		  }
		
    }
		
		
	}


