package com.exmaple.demo;

public class Operation {
	int a,b,add,sub,mul,div;

	void getData(int a,int b)
	{		
		this.a=a;
		this.b=b;
	}
	void add()
	{
		add=a+b;
		System.out.println("Addition is "+add);

	}
	void sub()
	{
		sub=a-b;
		System.out.println("Substraction is "+sub);
	}
	void mul()
	{
		mul=a*b;
		System.out.println("multiplication is "+mul);
	}
	void div()
	{
		div=a/b;
		System.out.println("Division is "+div);

	}
}
