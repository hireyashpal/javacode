package jdbcPrepareStatement;

import java.sql.*;
import java.util.Scanner;


public class FetchDataUsingPS 
{
 public static void main(String[] args) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
		
	 
	 PreparedStatement ps=c1.prepareStatement("select * from student where id=?");
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter a id ");
	 ps.setInt(1, sc.nextInt());
	
	   ResultSet  res=ps.executeQuery();

	 
	 while(res.next())
	  {
		 System.out.println("id   "+"Name "+" LastName  "+" Age");
		  System.out.println(res.getInt(1)+"  "+res.getString(2)+" "+res.getString(4)+"   "+res.getInt(3));
	  }
	  
	 ps.executeQuery();
	

 }

}
