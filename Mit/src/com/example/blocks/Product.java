package com.example.blocks;

public class Product {
	int productId;
	String productName;
	float productPrice;
	String Desc;
	void getProduct(int productId,String productName,float productPrice,String Desc)
	{
	this.productId=productId;
	this.productName =productName;
	this.productPrice=productPrice;
	this.Desc=Desc;
		
	}
	
	void display()
	{
		System.out.println("Product Id is= "+productId);
		System.out.println("Product name is= "+productName);
		System.out.println("Product price is= "+productPrice);
		System.out.println("Product desc is= "+Desc);

	}

	public static void main(String[] args) {
		Product p1=new Product();
		p1.getProduct(101,"mobile",15343.5f,"this is mobile phone");
		p1.display();
	}

}
