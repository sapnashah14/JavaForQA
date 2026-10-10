package org.java.io.qa;

import java.io.FileWriter;
import java.io.IOException;

public class CSVFileWriter {
	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\Sapna Shah\\eclipse-workspace\\DR704_Java\\Data\\";
		
		FileWriter fw=new FileWriter(path+"test.csv");
		fw.write("Admin\n");
		fw.write("Admin@123");
		
		fw.close();
	}
		
	
	}


