package org.javaoops.qa;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Sets {
	
	public static void main(String[] args) {
		Set<Integer> sets=new HashSet<>();
		
		sets.add(432);
		sets.add(56);
		
		for(int all:sets) {
			System.out.println(all);
		}
		sets.remove(56);
		for(int all:sets) {
			System.out.println(all);
		}
		Set<Integer> tset=new TreeSet<>();
		tset.add(45);
		tset.add(4);
		tset.add(9);
		tset.add(4);
		
		for(int all:tset) {
			System.out.println(all);
		}
	}

}
