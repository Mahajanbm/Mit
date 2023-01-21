package net.fuel.corejava;

import java.util.Scanner;
public class Student {
	
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.getData();
		s1.getData();
	}
	void getData()
	{
		int rollno;
		String name;
		String city;
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Student roll no");
		rollno=s1.nextInt();
		System.out.println("Enter Student name");
		name=s1.next();
		System.out.println("Enter Student City");
		city=s1.next();
		System.out.println("Student roll no Is= "+rollno);
		System.out.println("Student name Is= "+name);
		System.out.println("Student City Is= "+city);
	}
	

}
