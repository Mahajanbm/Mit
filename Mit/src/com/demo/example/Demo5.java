package com.demo.example;

public class Demo5 {

	public static void main(String[] args) {
		try {
			
			throw new User();
		} catch (User e) {
			// TODO: handle exception
			System.out.println("User define exception");
		}

	}

}
