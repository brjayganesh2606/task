package database;
import java.sql.*;
public class insert {

	public static void main(String[] args) {
		
	   try {
		   try {
			   Class.forName("com.mysql.jdbc.Driver");
		   		} 
		   catch (ClassNotFoundException e) 
		   {
			   e.printStackTrace();
		   }
		   
			Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:330/jay_employee", "root", "root");
			System.out.println("Connected With the database successfully");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?,?,?,?)");
			preparedStatement.setString(1,"1006");
			preparedStatement.setString(2,"BALA"); 
			preparedStatement.setString(3,"5");
			preparedStatement.setString(4,"31000");
			preparedStatement.setString(5,"MANAGER"); 
			preparedStatement.setString(6,"PUDUCHERRY");
			preparedStatement.executeUpdate();
			System.out.println("data inserted successfully");
	} catch (SQLException e) {
		
		System.out.println("Error while connecting to the database"+e);
	
			}
	}

}