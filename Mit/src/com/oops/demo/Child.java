package com.oops.demo;

public class Child  extends P1 
{
	public Child() {
		super(50); 
		System.out.println("Child Class constructor");
	}

	public  Child(int a)
	{ this();
		
		
		System.out.println("this is Parameterized Constructor");
	}
	public static void main(String[] args) {
		Child c1=new Child(10);
	//	Child c2=new Child();

	}

}
