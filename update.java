package database;
import java.sql.*;
public class update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
		    Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:330/jay_employee", "root", "root");//Establishing connection
			System.out.println("Connected With the database successfully");
			PreparedStatement preparedStatement=connection.prepareStatement("update employee set Salary=? where EmpID=?");
			preparedStatement.setString(1,"40000");
			preparedStatement.setString(2,"1005");
		    preparedStatement.executeUpdate();
		    System.out.println("data updated successfully");
		} catch (SQLException e) {
			 System.out.println("Error while connecting to the database");
		}

	}

}
