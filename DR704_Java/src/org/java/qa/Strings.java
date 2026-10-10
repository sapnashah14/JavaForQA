package org.java.qa;

public class Strings {

	public static void main(String[] args) {
		System.out.println("Start---------------");
		
		String s1="Abc";
		String s2= new String("abc");
		int a = 343;
		
		System.out.println(s1); // Abc 
		System.out.println(s2); //abc
		System.out.println(s1==s2); // boolean false
		System.out.println(s1.equals(s2)); //boolean false
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(2));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(s2));
	
		System.out.println(s1+a);
		System.out.println(s1.indexOf("c"));
		System.out.println(s1.contains("Ab"));
		
		String s3=s1.substring(1);
		System.out.println(s3);
		
		boolean b1=s1.isEmpty();
		System.out.println(b1);
		
		String s4="I am a test engineer";
				String str[]=s4.split(" ");
		for(String gtr:str) {
			System.out.println(gtr);
		}
		
		long b=54657678l;
		String strB=String.valueOf(b);
		System.out.println(strB.length());
		
		String s5="455";
		System.out.println(s5+1);
		
		Integer c=Integer.valueOf(s5);
		System.out.println(c+1);
		
		System.out.println(s1);
		s1=s1.replace("bc", "dc");
		System.out.println(s1);
		
		s1=s1.replaceAll(s1, "Sapna");
		System.out.println(s1);
		
		
		StringBuffer sb;
		StringBuilder sb2=new StringBuilder("afbdghs");
		sb2.append("Saydbdb");
		System.out.println(sb2);
		
		
		
		System.out.println("End----------");
		
	}

}
