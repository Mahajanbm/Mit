package com.example.exception;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,50,30,40,100};

		try {
			System.out.println(a[0]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			System.out.println(a[5]);  

		} 
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Index Out Of Bounds Exception");
		}
	}

}
