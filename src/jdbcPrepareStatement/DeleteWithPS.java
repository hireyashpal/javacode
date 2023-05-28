package jdbcPrepareStatement;

import java.sql.*;
import java.util.Scanner;

public class DeleteWithPS 
{
 public static void main(String[] args) throws Exception
 {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
       Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
       
       PreparedStatement ps=c1.prepareStatement("delete from student where id=? ");
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter a id ");
  	 ps.setInt(1, sc.nextInt());
  	
  	  
  	 
  	     ps.execute();
//       System.out.println( ps.execute());
         System.out.println("YES");     
       
 }

}
