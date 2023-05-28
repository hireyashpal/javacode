package jdbcPrepareStatement;

import java.sql.*;
import java.util.Scanner;

import javax.crypto.spec.PSource;

public class AllCRUDOperation 
{
 public static void main(String[] args) throws Exception
 {
	 Scanner sc=new Scanner(System.in);
	 
	 fetchData();
	 System.err.println("CHOOSE WHICH OPERATION YOU WANT TO DO IN YOUR DATA BASE");
	 System.out.println("1. Insert valuse \n2. Update Valuse \n3. Deleat Valuse");
	 
	 System.err.println("Enter a above one value");
	 
	 int key=sc.nextInt();
	 
	 switch (key) {
	case 1: insertValue();
		   System.out.println("Insert value");
		   break;
	case 2: updateValuse();
	        System.out.println("Update value");
            break;
	case 3: deleteValuse();
	        System.out.println("Delete value");
	        break;
	default:System.out.println("Sorry enter valid data");
		    
	}
	 if(key==1 || key==2 || key==3)
		 {
		 fetchData();
		 }
	 else
	 {
		 System.out.println("No operations happen on database");
	 }
	 
	 
 }
 
 public static void insertValue()throws Exception
 {
	
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	                             // "insert into student2(roll,name,branch) values(?,?,?)"
	 PreparedStatement ps=con.prepareStatement("insert into studentdb(id,name,mono,marks)values(?,?,?,?) ");	
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("How many students you want to enter data");
	 
     int num=sc.nextInt();
	 
	 for(int i=0;i<num;i++)
	 {
		 System.out.println("Enter a Student id");
		 ps.setInt(1, sc.nextInt());
		 
		 System.out.println("Enter a Student Name");
		 ps.setString(2, sc.next());
		 
		 System.out.println("Enter a Student Mobil Number");
		 ps.setLong(3, sc.nextLong());
		 
		 System.out.println("Enter a Marks");
		 ps.setInt(4, sc.nextInt());     
		 
		 ps.execute();

	 }	 	 
	 
	 System.out.println("Valuse are inserted");
	 
 }
 
 public static void updateValuse()throws Exception
 {	 
	 Scanner sc=new Scanner(System.in);
	 
	 Class.forName("com.mysql.cj.jdbc.Driver");

	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
     
	 PreparedStatement ps=con.prepareStatement("update studentdb set  mono=?  where marks=?");
	 
	 System.out.println("Enter a new name");  
	    ps.setString(1, sc.next());
	 
	 System.out.println("Enter a id which name you want to change");
	    ps.setInt(2, sc.nextInt());
	 
	 System.out.println("Value is Udated ");
	    
	    ps.execute();
 }
 
 public static void deleteValuse() throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 PreparedStatement ps=c.prepareStatement("delete from studentdb where name=?");
	 
	 Scanner sc=new Scanner(System.in);
	 
	   System.out.println("Enter a Name which want to dalete");
	   ps.setString(1, sc.next());
	   
	   ps.execute();
	   
	   System.out.println("deleted successfully........!"); 
 }
 
 public static void fetchData() throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 PreparedStatement ps=cn.prepareStatement("select * from studentdb");
	 
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("Enter Table Name");
	 
	 // ps.setString(1, sc.next());
	 ResultSet res=ps.executeQuery();
	 
	 System.out.println("id |  NAME   | MONO | MARKS");
	    while(res.next())
	    {
	    	System.out.println(res.getInt(1)+"  | "+res.getString(2)+" | "+res.getInt(3)+" | "+res.getInt(4));
	    	
	    } 
 }
 
}
