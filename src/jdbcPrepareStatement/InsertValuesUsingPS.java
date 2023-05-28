package jdbcPrepareStatement;

import java.sql.*;
import java.util.Scanner;

public class InsertValuesUsingPS 
{
 public static void main(String[] args) throws Exception
 {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
		
		PreparedStatement ps=c1.prepareStatement("insert into student2(roll,name,branch) values(?,?,?)");
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many students you want to enter data");
		int num=sc.nextInt();
		
		for (int i = 0; i < num ; i++) 
		{
			System.out.println("Enter a Roll number");
			ps.setInt(1, sc.nextInt());
			
			System.out.println("Enter a NAME");
			ps.setString(2, sc.next());
			
			System.out.println("Enter a Branch");
			ps.setString(3, sc.next());
			ps.execute();
		}
//		System.out.println("Enter a LAST NAME");
//		ps.setString(4, sc.next());
		
		
		
		
		System.out.println("All values are inserted");
		
		
		
		
 }

}
