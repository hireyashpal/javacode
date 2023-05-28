package batchProcessing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PraparedStatementWithBPPlaseHolder 
{
	  public static void main(String []args) throws Exception
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
			
		  //st.addBatch("update   account set name='Yash' where name='Yashpal'");
		  PreparedStatement ps=con.prepareStatement("insert into account(id,name,email,pass) values(?,?,?,?)");

		  Scanner sc=new Scanner(System.in);
		  System.out.println("how many Account you want to Add");
		  int num=sc.nextInt();
		  
		 for(int i=0; i<num;i++)
		 {
			 System.out.println("Enter id");
			 ps.setInt(1, sc.nextInt());
			 
			 System.out.println("Enter a name");
			 ps.setString(2, sc.next());
			 
			 System.out.println("Enter a Email id");
			 ps.setString(3, sc.next());
			 
			 System.out.println("Enter a pass");
			 ps.setString(4, sc.next());
			 
			 ps.addBatch();
		 }
			 
		
		  ps.executeBatch();
		  
		  System.out.println("Add!");
	  }
}
