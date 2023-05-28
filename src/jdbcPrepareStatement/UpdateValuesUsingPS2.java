package jdbcPrepareStatement;

import java.sql.*;
import java.util.Scanner;

public class UpdateValuesUsingPS2 
{
 public static void main(String[] args) throws Exception
 {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	
	PreparedStatement ps=c1.prepareStatement("update student2 set name=? where roll=? "); //Pass Qu. at that time we can create a object of PreparedStatement.
	                                                                                      // in method executeUpdate, execute AND executeQu we can not pass Qu.
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter a NEW NAME");
	ps.setString(1, sc.next());	

	System.out.println("Enter a id Which want you change");
	ps.setInt(2, sc.nextInt());
	
	ps.executeUpdate();
	
	
	System.out.println("Value is Updated");
	
	
 }

}
