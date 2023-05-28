package jdbcPrepareStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Account 
{
	public static void main(String[] args) throws Exception
	 {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");

		 Statement st=c.createStatement();
		 
//		 st.execute("create table account(id int,name varchar(20), email varchar(20), pass varchar(20) )");
//		 
//		 System.out.println("table is created");
//		
		 //insertValue();

		 fetch();
	 }
	
	public static void insertValue()throws Exception
	 {
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
		                             
		 PreparedStatement ps=con.prepareStatement("insert into account(id,name,email,pass)values(?,?,?,?) ");
		 
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("How many Account  you want to enter data");
		 
	     int num=sc.nextInt();
		 
		 for(int i=0;i<num;i++)
		 {
			 System.out.println("Enter a Account id");
			 ps.setInt(1, sc.nextInt());
			 
			 System.out.println("Enter a Account holdar  Name");
			 ps.setString(2, sc.next());
			 
			 System.out.println("Enter a Account holdar  Email");
			 ps.setString(3, sc.next());
			 
			 System.out.println("Enter a Pass");
			 ps.setString(4, sc.next());     
			 
			 ps.execute();

		 }	 	 
		 
		 System.out.println("Valuse are inserted");
		 
	 }
	
	public static void fetch() throws Exception
	 {
		 Scanner sc=new Scanner(System.in);

		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
			
	     PreparedStatement ps=cn.prepareStatement("select * from account where email=? and pass=?");
		
	     System.out.println("Enter a email");
		 ps.setString(1, sc.next());
	     
		 System.out.println("Enter a pass");
	     ps.setString(2, sc.next());
		   
	    ResultSet res= ps.executeQuery();
	     
		    	if(res.next())
		    	{
		    		System.out.println("id |  NAME   | email    | pass");
			    	System.out.println(res.getInt(1)+" | "+res.getString(2)+" | "+res.getString(3)+" | "+res.getString(4));
		    	}	
		    	else
		    	{
				    System.out.println("enter valid input");	
		    	}
	 }
   
}
