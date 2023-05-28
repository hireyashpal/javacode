package jdbcdemo;

import java.sql.*;

import java.sql.Statement;

public class CreateTable 
{
 public static void main(String[] args) 
 {
     try 
     {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
    	 
    	Statement s1=con.createStatement();
    	
    	s1.execute("create table student(id int,name varchar(20),mono int)");
    	
    	System.out.println("table is created");
	 }
     catch (Exception e)  
     {
		e.printStackTrace();
	 }
	 
	 
 }
}
