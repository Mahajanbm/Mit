package com.example.exception;
import java.io.*;
public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f1=new File("C:\\Users\\Mahi\\Desktop\\MechcivilChemical\\demo.txt");
		FileInputStream file=null;
		try {
			file=new FileInputStream(f1);
			System.out.println("File is available");
			String string=null;
			System.out.println(string.charAt(0));

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File not Found");
		}

		finally {
			file.close();
			System.out.println("File close");
		}

	}

}
