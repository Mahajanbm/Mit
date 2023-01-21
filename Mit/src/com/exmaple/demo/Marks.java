package com.exmaple.demo;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Marks {
	Scanner s=new Scanner(System.in);
	int s1,s2,s3,s4,s5;
	int sum;
	
	float per;
	void getResult()
	{
		System.out.println("Enter all subjects marks");
		s1=s.nextInt();
		s2=s.nextInt();
		s3=s.nextInt();
		s4=s.nextInt();
		s5=s.nextInt();
		sum=s1+s2+s3+s4+s5;
		per=(sum*100)/500;
		
		
		if(per>75 )
		{
			System.out.println("Topper");
		}
		else if(per>60 || per<=74.99)
		{
			System.out.println("First class");
		}
		else if(per>55 || per<59.99)
		{
			System.out.println("Higher Second class");
		}
		else  if(per>=50 || per<=54.99){
			System.out.println("Second Class");
		}
		else {
			System.out.println("Pass class");
		}
		
		
	}

}
