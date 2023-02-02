package com.demo.poly.demo;

public class Test {

	public Test()
	{
		System.out.println("default constructor");
	}
	public 	 Test(int a)
	{	System.out.println("int parameterized constructor");

	}
	public 	 Test(String a)
	{	System.out.println("String parameterized constructor");

	}
	public static void main(String[] args) {
		Test t1=new Test(10);
	}

}
