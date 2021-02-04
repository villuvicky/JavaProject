package com.mustknow.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class MySql {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String Host="root@localhost";
		String Database = "user_database?serverTimezone=UTC";
		String UserName=null;
		String Password=null;
		String Port=null;
		

		Connection connection=DriverManager.getConnection("jdbc:mysql://"+Host+"/"+Database+"");
		Statement  statement=connection.createStatement();
		//	int query=	statement.executeUpdate("CREATE TABLE Persons (\r\n" + 
		//				"    PersonID int,\r\n" + 
		//				"    LastName varchar(255),\r\n" + 
		//				"    FirstName varchar(255),\r\n" + 
		//				"    Address varchar(255),\r\n" + 
		//				"    City varchar(255)\r\n" + 
		//				");");
		//		"SET PersonID='1',LastName='K',FirstName='Vignesh',Address='K A Nagar 4th cross',City='Karur';");
		//	statement.executeUpdate("Update persons\r\n" + 
		//			"SET LastName=Null\r\n" + 
		//			"where PersonID='1';");

		ResultSet data= statement.executeQuery("SELECT * FROM persons;");
		System.out.println("PersonID"+"\t"+"LastName"+"\t"+"FirstName"+"\t"+"Address"+"\t"+"City");
		while(data.next()) {

			System.out.println(data.getString(1)+"\t"+data.getString(2)+"\t"+data.getString(3)+"\t"+data.getString(4));
		}
	}
}

