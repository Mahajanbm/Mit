package com.example.exception;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class JdbcDemo {

	public static void main(String[] args)  {
		String driver="com.mysql.jdbc.Driver";

		String user="root";
		String pass="4321";
		String url="jdbc:mysql://localhost:3306/ty3to6";
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,user,pass);

			System.out.println("Connected");


		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error");
		}

	}

}
