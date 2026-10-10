package org.java.io.qa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadAndWriteperationsUsingBufferReaderOrWriter2 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Sapna Shah\\eclipse-workspace\\DR704_Java\\BW.txt"));
		
		String line;
		
		while((line = br.readLine()) !=null) {
			System.out.println(line);
		}
		br.close();
	}
		
	}


