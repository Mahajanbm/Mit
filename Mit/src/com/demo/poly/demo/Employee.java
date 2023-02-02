package com.demo.poly.demo;

public class Employee {
	int eId;
	String eName;
	String eCity;
	String eDept;
	void getData() {
		System.out.println("With out parameter method getData");
	}
	void getData(int eId) {
		System.out.println("With Int parameter method getData");
	}
	void getData(String  eName) {
		System.out.println("With String parameter method getData");
	}
	void getData(int eId,String eName) {
		System.out.println("With int  String parameter method getData");
	}
}
