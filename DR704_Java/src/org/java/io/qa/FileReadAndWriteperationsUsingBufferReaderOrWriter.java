package org.java.io.qa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileReadAndWriteperationsUsingBufferReaderOrWriter {
	
	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\Sapna Shah\\eclipse-workspace\\DR704_Java\\Data";
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("./BW.txt"));
		bw.write("admin");
		bw.write(":");
		bw.write("Admin@123\n");
		
		bw.close();
	}
		
	}


