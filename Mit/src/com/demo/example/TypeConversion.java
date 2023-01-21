package com.demo.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TypeConversion {

	public static void main(String[] args) {
		byte b=50;
		int a=b;
		
		short s=100;
		long l=s;
		int x=900;
		float f=x;
		System.out.println(a);
		System.out.println(l);
		System.out.println(f);
	}

}
