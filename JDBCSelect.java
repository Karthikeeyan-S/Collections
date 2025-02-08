package JDBC;

import java.sql.*;

class JDBCSelect
{
	public static void main(String [] args)
	{
		try
		{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqldb","root","Password@12"); // Creating a connection object
			Statement stmt = con.createStatement(); // Creating a Statement object
			ResultSet rs = stmt.executeQuery("select * from movie");  // Creating a ResultSet object which will get data from database and deliver here
			while(rs.next())	// This loop will fetch for the data which is present in the table, We have to specify the data-type of the record
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5));
			}
			con.close(); // Closing of a connection is a mandatory thing which has to be done!!
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
}