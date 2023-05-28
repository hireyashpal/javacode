package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC2 
{
 public static void main(String[] args) 
 {
   try
   {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 System.out.println("Driver Registered SuccessFully!");
		 
	 Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3307", "root", "Yashpal@123");
     System.out.println("connection  Estabilish SuccessFully!");   
	   
   }
   catch (Exception e) 
   {
	   e.printStackTrace();
   }
 }
}
