package jdbcdemo;

import java.sql.*;

public class emp 
{
 public static void main(String[] args) throws ClassNotFoundException , SQLException
 {
		
			Class.forName("com.mysql.cj.jdbc.Driver");
	
			Connection	c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10", "root", "Yashpal@123");
			
			Statement s1=c1.createStatement();
			//s1.execute("create table emp(ename varchar(20),eid int , sal int)");
			
			//s1.execute("insert into student values(101,'Yashpal',12)");
			//s1.execute("insert into student values(102,'Vishnu',13)");
//			s1.execute("insert into student values(103,'Sanket',14)");
//			s1.execute("insert into student values(104,'Prashant',15)");
//			s1.execute("insert into student values(105,'Shubham',16)");
//			s1.execute("insert into student values(106,'Sameer',17)");
//			s1.execute("insert into student values(107,'Juned',18)");
//			s1.execute("insert into student values(108,'Deepak',19)");
			
//			s1.execute("ALTER TABLE student RENAME COLUMN mono TO age");
			
			
			
			System.out.println("Valuse inserted");
	
 }

}
