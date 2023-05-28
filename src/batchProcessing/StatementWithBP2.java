package batchProcessing;

import java.sql.*;

public class StatementWithBP2 
{
 public static void main(String[] args) throws Exception 
 {
Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	
	 Statement st=con.createStatement();
	 
	 //Insert
	 st.addBatch("insert into account(id,name,email,pass)values(23,'Shubham','shubham@123','Shubham@123')" );
	 st.addBatch("insert into account(id,name,email,pass)values(21,'Shubham','shubham@123','Shubham@123')" );
	 st.addBatch("insert into account(id,name,email,pass)values(2,'Vishnu','vishnu@123','Vishnu@123')" );

	 // Update
	 st.addBatch("update   account set name='Yash' where name='Yashpal'");

	 // Delete
	 st.addBatch("delete from account where id=124  ");
	 
	 st.executeBatch();
	 
	 System.out.println("OK......!");

	 
	 
 }

}
