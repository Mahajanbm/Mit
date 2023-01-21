package com.opps.demo.example;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Employee {
	private int eId;
	private String  eName;
	private	String eCity;
	private	float eSalary;
	public Employee() {
		System.out.println("Constructor");
	}	
	static {
		System.out.println("this is static blcok");
	}

	{
		System.out.println("this is non-static block");

	}

	public static 	void getData(int eId,String eName,String eCity,float eSalary)
	{
		eId=eId;
		eName=eName;
		eCity=eCity;
		eSalary=eSalary;

	}
	public void seteId(int eId)
	{
		this.eId=eId;
	}

	public int geteId()
	{
		return eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteCity() {
		return eCity;
	}
	public void seteCity(String eCity) {
		this.eCity = eCity;
	}
	public float geteSalary() {
		return eSalary;
	}
	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}
	public void display()
	{
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(eCity);
		System.out.println(eSalary);
	}


}
