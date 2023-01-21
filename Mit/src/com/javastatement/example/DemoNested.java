package com.javastatement.example;

import java.util.Scanner;



public class DemoNested {

	public static void main(String[] args) {
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter 1St number");
		a=s1.nextInt();
		System.out.println("Enter 2nd Number");
		b=s1.nextInt();
		System.out.println("Enter 3rd number");
		c=s1.nextInt();
		if(a>b && a>c)
		{
			System.out.println("Greater number is "+a);
		}
		else if(b>a && b>c) {
			System.out.println("Greater number is "+b);
		}
		else if(c>a && c>b) {
			System.out.println("Greater number is "+c);
		}
		else if(a==b && a==c) {
			System.out.println("all are equal");
		}
		else {
		System.out.println("2 numbers are equal");
		}

	}

}
