package batchProcessing;

import java.sql.*;


public class StatementWithBP 
{
 public static void main(String[] args) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	
	 Statement st=con.createStatement();
	
	 //st.addBatch("insert into account(id,name,email,pass)values(23,'Shubham','shubham@123','Shubham@123')" );

	 try
	 {
	 st.addBatch("insert into account(id,name,email,pass) valuse(1,'')");
	 st.addBatch("insert into account(id,name,email,pass) valuse(7,'Satish','satish@123','Satish@123')");
	 st.addBatch("insert into account(id,name,email,pass) valuse(8,'Karan','karan@123','Karan@123')");
	 st.addBatch("insert into account(id,name,email,pass) valuse(9,'Krunal','rushi@123','Rushi@123')");
	 st.addBatch("insert into account(id,name,email,pass) valuse(10,'Kunal','kunal@123','kunal@123')");

	 st.executeBatch();
	 }
	 catch (Exception e) 
	 {
	    System.out.println("yes i can find it");
	}

	 
	 
	 System.out.println("updat");
	 
 }

}
