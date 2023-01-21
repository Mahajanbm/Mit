package com.example.blocks;

public class Student {
	static	void display()
	{
		System.out.println("Hello Display");
	}

	static
	{
		System.out.println("this is static block 1");
	}
	
	static{
		System.out.println("This is static block 2");
	} 
	
	{
		
		System.out.println("this is non-staic block 1");
	}
	
	{
		System.out.println("this  is non-static block 2");
	}
	public static void main(String[] args) {
		Student.display();

		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
	
	}

}
