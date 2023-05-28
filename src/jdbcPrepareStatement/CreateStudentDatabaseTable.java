package jdbcPrepareStatement;

import java.sql.*;

public class CreateStudentDatabaseTable 
{
 public static void main(String[] args) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");

	 Statement st=c.createStatement();
	 
	 st.execute("create table studentDB(id int,name varchar(20), mono int, marks int)");
	 
	 System.out.println("table is created");
	
	 
	 
 }
}
