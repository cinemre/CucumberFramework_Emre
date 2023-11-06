package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		// Map is a interface new 
		Map<String,String> map = new LinkedHashMap<>();
		
		map.put("firstName", "Emre");
		map.put("lastName", "Cinar");
		map.put("age", "30");
		
		
		System.out.println(map);
		
		
		String name = map.get("firstName");
		System.out.println(name);
		
		String lastname = map.get("lastName");
		System.out.println(lastname);
		
		String age = map.get("age");
		System.out.println(age);
	}

}
