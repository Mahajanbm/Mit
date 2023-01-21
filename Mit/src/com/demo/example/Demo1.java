package com.demo.example;
public class Demo1 implements P2 {
	public void display() {
		System.out.println("I1 Interface method");
	}
	public void demo() {
		System.out.println("I2 Interface method");
	}
	public static void main(String[] args) {
		P1 i1=new Demo1();
		i1.demo2();
		i1.display();
		P2 p2=new Demo1();
		p2.demo();
		p2.demo2();
		p2.display();
		P1.demo1();
	}




}
