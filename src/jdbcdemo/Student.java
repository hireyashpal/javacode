package jdbcdemo;

import java.sql.*;


public class Student 
{
 public static void main(String[] args) throws Exception
 {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3307/peja10","root","Yashpal@123");
	 
	 Statement s1=com.createStatement();
	 
	 //s1.execute("create table student(id int , name varchar(20),age int)");
	 
	 
//	    s1.execute("alter table student add lname varchar(20)  ");
//	 	s1.execute("update student set lname='Hire' where name='yashpal'");
	    
//	    s1.execute("delete from student where id=102");
//	 s1.execute("insert into  student values(102,'Vishnu',13,'Jadhav')");
//	    s1.execute("update student set lname='Jadhav' where name like 'vish%'");
	 
//	 s1.execute("alter table student modify id int unique");
//	 s1.execute("alter table student modify id int primary key");
	 
//	 s1.execute("update student set lname='Jadhav' where name ='Sanket'");
//	 s1.execute("update student set lname='Jadhav' where name like 'pra%'");
//	 s1.execute("update student set lname='Barase' where name='Shubham'");
	 
	 
	 
	 
	 System.out.println("teble is created");
	 

 }

}
