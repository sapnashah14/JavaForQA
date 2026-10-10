package org.javaoops.qa;

import java.util.Map;
import java.util.HashMap;

public class Maps {
	
	public static void main(String[] args) {
		
		Map<Integer, String> maps=new HashMap<>();
		
		maps.put(1, "Sapna");
		maps.put(2, "Vaishnavi");
		maps.put(null, "Sujal");
		
		System.out.println(maps);
		
		for(Map.Entry all:maps.entrySet());
		//System.out.println(getKey()+" "+all.getValue());
		
	}

}
