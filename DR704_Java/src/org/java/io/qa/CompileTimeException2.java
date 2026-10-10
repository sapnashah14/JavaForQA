package org.java.io.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CompileTimeException2 {

	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		System.out.println("Start");

		File file = new File("hdfshdfhj");
		FileInputStream fi = new FileInputStream(file);

		Thread.sleep(5000);

		System.out.println("End");
	}

}
