package com.example.exception;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str=null;
		try {
			System.out.println(str.charAt(0));
		} 
		
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("null pointer Exception/please assign some value to string data");
		}
	}
}