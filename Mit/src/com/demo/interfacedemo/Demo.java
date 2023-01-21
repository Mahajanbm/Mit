package com.demo.interfacedemo;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo implements I1 ,I2{
 public void demo()
 {
	 System.out.println("Demo method");
 }
 public void display() {
	System.out.println("Display Method");	
		
 }
 public static void main(String[] args) {
	I1 i1=new Demo();
	i1.demo();
	I2 i2=new Demo();
	i2.display();
	i2.demo();
}


}
