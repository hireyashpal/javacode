package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class student2 
{
 public static void main(String[] args) throws Exception 
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Yashpal@123");
	 
	 Statement s1=c1.createStatement();
	 
	 s1.execute("create table student2(roll int ,name varchar(20) ,branch varchar(10)) ");
	 
	 System.out.println("table created...");
	 

 }

}
