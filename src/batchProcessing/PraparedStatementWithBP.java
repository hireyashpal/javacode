package batchProcessing;

import java.sql.*;

public class PraparedStatementWithBP 
{
  public static void main(String []args) throws Exception
  {
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  
	  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	  
	 //st.addBatch("insert into account(id,name,email,pass)values(23,'Shubham','shubham@123','Shubham@123')" );
	  PreparedStatement ps=con.prepareStatement("insert into account(id,name,email,pass) values(111,'Hitesh','hitesh@123','Hitesh@123')");

	  ps.addBatch();
	  ps.addBatch();
	  ps.addBatch();
	  
	  ps.executeBatch();
	  
	  System.out.println("Add!");
	  
  }
}
