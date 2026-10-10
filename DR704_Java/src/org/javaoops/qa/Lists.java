package org.javaoops.qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {
	
	public static void main(String[] args) {
		List<Integer> lists=new ArrayList<>();
		System.out.println(lists);
		System.out.println(lists.isEmpty());
		lists.add(2533);
		lists.add(555);
		lists.add(666);
		lists.add(777);
		
		System.out.println(lists);
		System.out.println(lists.size());
		System.out.println(lists.isEmpty());
		System.out.println(lists.getFirst());
		System.out.println(lists.get(2));
		
		for(int i=0; i<lists.size();i++) {
			System.out.println(lists.get(i)+" ");
		}
		
		for(int all:lists) {
			System.out.println(all);
		}
		
		Iterator<Integer> it=lists.iterator();
		while(it.hasNext()) {
			int allValues=it.next();
			System.out.println(allValues);
		}
		
	}

}
