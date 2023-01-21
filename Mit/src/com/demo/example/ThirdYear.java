package com.demo.example;

public class ThirdYear {
int a=100;
static int b=150;

	static	void getData()
	{
		System.out.println("This Static method");
	}
	
	void demo()
	{
		System.out.println("this is non static method");
	}
	public static void main(String[] args) {
		ThirdYear.getData();
		ThirdYear.getData();
		
		ThirdYear  t1=new ThirdYear();
		t1.demo();
		System.out.println(t1.a);
		System.out.println(ThirdYear.b);

	}

}
