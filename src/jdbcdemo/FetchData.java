package jdbcdemo;

import java.sql.*;
import java.util.Iterator;

public class FetchData 
{
 public static void main(String[] args) throws Exception
 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
		
		Statement s1=com.createStatement();
		
		
		   ResultSet  res=s1.executeQuery("select * from Student ");
		   
		  while(res.next())
		  {
			  System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(4)+' '+res.getInt(3));
		  }
		  
		   
//		   System.out.println(res.next());
//		   System.out.println(res.getInt(1));
//		   System.out.println(res.getString(2));
//		   System.out.println(res.getInt(3));
//		   System.out.println(res.getString(4));
//		   
//		
//		   System.out.println(res.next());
		
		
		
		
 }

}
