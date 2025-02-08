package JDBC;

import java.sql.*;

class JDBCUpdate
{
	public static void main(String [] args)
	{
		 final String DB_URL = "jdbc:mysql://localhost:3306/sqldb";
		 final String USER = "root";
		 final String PASS = "Password@12";
		 @SuppressWarnings("unused")
		String QUERY = "create table student3 (roll_no int primary key, name varchar(200), department varchar(200));";
		 try 
		 {
			 Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement st = con.createStatement();
			 String se = "select * from student3;";
			 //st.executeUpdate(QUERY);
			 //st.executeUpdate("set SQL_SAFE_UPDATES=0;");
			 //st.executeUpdate("insert into student3 values(102,'Manas','CSBS');");
			 //st.executeUpdate("drop table student3;");
			 //st.executeUpdate("update student3 set name='Manas' where roll_no=102");
			 //st.executeUpdate("delete from student3 where name = 'manas'");
			 ResultSet rs = st.executeQuery(se);
			 System.out.println("roll_no"+"		"+"Name"+"		"+"Department");
			 while(rs.next())
			 {
				 
				 System.out.println(rs.getInt(1)+"		"+rs.getString(2)+"		"+rs.getString(3));
			 }
			 rs.close();
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
		
	}
}
