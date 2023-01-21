package com.demo.example;

public class Client  implements I1,I2{
 public void demo()
 {
	System.out.println("Demo method Implementation"); 
 }

	public static void main(String[] args) {
	Client c1=new Client();
	c1.demo();
	I1 i1=new Client();
	i1.demo();
	I2 i2=new Client();
	i2.demo();
	}

}
