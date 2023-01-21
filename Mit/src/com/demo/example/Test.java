package com.demo.example;
public  class Test  extends Demo{
int a;
	
	
	public Test(int a) {
	super();
	this.a = a;
}
	public void demo1()
	{
		System.out.println("Demo 1 method");
	}
	public static void main(String[] args) {
		Test t1=new Test(10);
		//Demo d1=new Test();
		//d1.demo1();
		

	}

}
