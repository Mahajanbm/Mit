package com.demo.example;

public interface P1 {
	void display();

	static void demo1() {
		System.out.println("method");
	}

	default	void demo2()
	{System.out.println("Default method");

	}
}
