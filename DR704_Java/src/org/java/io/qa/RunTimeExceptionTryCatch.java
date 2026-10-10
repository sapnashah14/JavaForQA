package org.java.io.qa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class RunTimeExceptionTryCatch {

	public static void main(String[] args)  {

		System.out.println("Start");

		try {
			int a=10;
			
			System.out.println(a);
			System.out.println(a/0);
		}catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println("End");
	}

}
