package org.javaoops.qa;

import java.util.List;
import java.util.LinkedList;

public class Lists2 {
	
	public static void main(String[] args) {
		List lists=new LinkedList<>();
		
		lists.add("fdshgfdh");
		lists.add("bnbnbn");
		lists.add(364);
		
		for(Object all:lists) {
			System.out.println(all);
		}
	}

}
