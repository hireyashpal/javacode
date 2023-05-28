package jdbcdemo;

import java.sql.*;
import java.sql.DriverManager;



public class Demo1 
{
 public static void main(String[] args) 
 {
	 try 
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 System.out.println("ok!============");
		 
		 Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307","root","Yashpal@123");//E 
		System.out.println("hi");
		
		Statement st=c1.createStatement();
		
		st.execute("create database PEJA10");// execute() is non-static method thats why we can call it object reference 
		System.out.println("Database is created");
		
	 } 
	 catch (Exception e) 
	 {
		e.printStackTrace();
	 }
	 
	 
	 
	 
 }

}
