package jdbcPrepareStatement;

import java.sql.*;

public class FetchAllData 
{
 public static void main(String[] args) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
		
     Statement ps=cn.createStatement();
	 ResultSet res=ps.executeQuery("select * from studentdb");
     System.out.println("id |  NAME   | MONO | MARKS");
	    while(res.next())
	    {
	    	System.out.println(res.getInt(1)+"  | "+res.getString(2)+" | "+res.getInt(3)+" | "+res.getInt(4));
	    	
	    } 

 }

}
