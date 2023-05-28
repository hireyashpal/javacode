package jdbcdemo;

import java.sql.*;

public class Student3 
{
 public static void main(String[] args) throws Exception 
 {
	 
	 updateData("student", "id", "100", "name", "'Yashpal'");
 }
 
 public static void updateData(String tableName,String colname ,String newvalu,String comname2,String refe)throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement s1=c1.createStatement();
	 
	//s1.execute("update "+ tableName+ " set "+ colname+"="+newvalu+" where " +comname2+"="+refe);
	//System.out.println("update "+ tableName+ " set "+ colname+"="+newvalu+" where " +comname2+"="+refe); 
 }
 
 public static void insertValuse()throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection c1=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement s1=c1.createStatement();
	 s1.execute("insert into  student values(102,'Vishnu',13,'Jadhav')");
 }
 public static int delete() throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement s1=con.createStatement();
	 
	 return s1.executeUpdate("delete from student where id=102");
	 
 }

}
