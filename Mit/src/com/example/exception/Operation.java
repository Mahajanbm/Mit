package com.example.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operation {
	public static void main(String[] args) {
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		try {
			System.out.println("Enter 1st Number");
			a=s1.nextInt();
			System.out.println("Enter  2nd Number");
			b=s1.nextInt();
			c=a/b;

			System.out.println("Division is= "+c);
		}
		

		catch (InputMismatchException e) {
			System.out.println("please enter integer kind of data ");
		}
		
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero exception");
		}
		catch (Exception e) {
			System.out.println("please enter valid Data");
		}
		

	}

}
