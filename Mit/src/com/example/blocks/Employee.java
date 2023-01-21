package com.example.blocks;

public class Employee {
	int a,b,result;
	void inputData(int x,int y)
	{ 
		a=x;
		b=y;
		result=a+b;
		System.out.println(result);
	}



	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.inputData(20,50);

	}

}
