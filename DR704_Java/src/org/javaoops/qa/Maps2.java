package org.javaoops.qa;

import java.util.Map;
import java.util.TreeMap;

public class Maps2 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> maps=new TreeMap<>();
		maps.put(2, 5);
		maps.put(1, 455);
		maps.put(3, 1);
		maps.put(6, 1);
		System.out.println(maps);
		
		for(Map.Entry all:maps.entrySet()) {
			System.out.println(all.getKey()+""+all.getValue());
		}
	}

}
