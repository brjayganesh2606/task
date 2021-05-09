package database;
import java.sql.*;
public class db_conn {

	public static void main(String[] args) {	
	   try 
	   {
		   
		   try 
		   {
			   Class.forName("com.mysql.jdbc.Driver");
		   } 
		   catch (ClassNotFoundException e) 
		   {
			e.printStackTrace();
		   }
		  Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:330/jay_employee", "root", "root");
		  System.out.println("Connected With the database successfully");
		 
	   } 
	   catch (SQLException e)
	   {
		System.out.println("Error while connecting to the database"+e);
	
		}
	}

}