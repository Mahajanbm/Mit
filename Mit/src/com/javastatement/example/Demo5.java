package com.javastatement.example;

import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		String str="mahi1";
		Scanner s1=new Scanner(System.in);
		System.out.println("enter String data");
		str=s1.next();
		switch(str)
		{

		case "mahi":
			System.out.println("this is mahi");

			break;
		case "virat":
			System.out.println("this is virat");

			break;


		case "rohit":
			System.out.println("this is rohit");

			break;


		default:
			System.out.println("please valid data");




		}
	}
}
