package com.javastatement.example;

import java.util.Scanner;

public class DemoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter number");
		a=s1.nextInt();
		if(a%2==0)
		{
			System.out.println("It is Even number");
		}
		else {
			System.out.println("It is odd number");
		}
		System.out.println("End of program");
	}

}
