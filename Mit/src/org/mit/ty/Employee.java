package org.mit.ty;

public class Employee {
	int eId;
	String eName;
	String eCity;
	String eCountry;
	float eSalary;
	void employeeDetails(int eId,String eName,String eCity,String eCountry,float eSalary)
	{
		this.eId=eId;
		this.eName=eName;
		this.eCity=eCity;
		this.eCountry=eCountry;
		this.eSalary=eSalary;
	}
	
	
	
	void display()
	{
		System.out.println("Employee Id is= "+eId);
		System.out.println("Employee name is= "+eName);
		System.out.println("employee city is= "+eCity);
		System.out.println("Employee Country is= "+eCountry);
		System.out.println("Employee salary is=  "+eSalary);
	}

	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.employeeDetails(101,"mahi","hyd","India",15243);
		e1.display();
	}

}
