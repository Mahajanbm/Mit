package com.mit.ty;

import java.util.Scanner;

public class Client {
	
	void operation()
	{
		int a,b,Result;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		
		b=s1.nextInt();
		Result =a+b;
		System.out.println("Addition is "+Result);
	}
	public static void main(String[] args) {
		
		Client c1=new Client();
		c1.operation();
		c1.operation();
		c1.operation();
		
	
	
}

}
