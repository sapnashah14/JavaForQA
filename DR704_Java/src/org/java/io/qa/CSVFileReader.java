package org.java.io.qa;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFileReader {
	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Sapna Shah\\eclipse-workspace\\DR704_Java\\Datatest.csv";
		
		FileReader fr=new FileReader(path);
		Scanner sc=new Scanner(fr);
		
		while(sc.hasNextLine()) {
			String value=sc.nextLine();
			System.out.println(value);
			
			if(value.equals("Admin") || value.equals("Admin@123")) {
				System.out.println("Values Matched");
			}else {
				System.out.println("Incorrect Values");
			}
		}
		
		sc.close();
		fr.close();
	}
		
	
	}


