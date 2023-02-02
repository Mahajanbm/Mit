package com.demo.example;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		String driver="com.mysql.jdbc.Driver";
		String user="root";
		String pass="4321";	
		String url="jdbc:mysql://localhost:3306/ty3to6";
		String insert="insert into tblemp values(102,'Dhoni','Ranchi',555555)";
		String delete="delete from tblemp where id=102";
		
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);
			System.out.println("Connected");
			Statement statement=con.createStatement();
			statement.executeUpdate(delete);
			System.out.println("Data deleted sucess fully");
		
			
			
		 
	}

}
