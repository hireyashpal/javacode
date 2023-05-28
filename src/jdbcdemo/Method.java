package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Method 
{
 public static void main(String[] args) throws Exception 
 {

	System.out.println(insertExecute("student", "(101,'Yashpal',13,'Hire')"));

 }
 public static boolean insertExecute(String tableName,String valuse)throws Exception
 {
	 
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement s1=con.createStatement();              
//	 s1.execute("insert into  student values(102,'Vishnu',13,'Jadhav')");
	 System.out.println("insert into "+tableName+" values"+valuse);
	     return s1.execute("insert into "+tableName+" values "+valuse);
	 	 
 }

 
 public static boolean deleteExecute(String tableName, String condition) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement c1=con.createStatement();
	 
	     return  c1.execute("delete from "+tableName+" where "+condition);
	 
	 
 }
 public static int deleteExecuteUpdate(String tableName, String condition) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement c1=con.createStatement();
	 
	    return   c1.executeUpdate("delete from "+tableName+" where "+condition);
	 
	 
 }
 
 

}
