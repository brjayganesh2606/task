package database;
import java.sql.*;
public class retrive {

	public static void main(String[] args) {
		
		 try {
			 try {
					Class.forName("com.mysql.jdbc.Driver");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			Connection	 connection = DriverManager.getConnection("jdbc:mysql://localhost:330/jay_employee", "root", "root");
			System.out.println("Connected With the database successfully");
			PreparedStatement preparedStatement=connection.prepareStatement("select * from employee");         
	        ResultSet resultSet=preparedStatement.executeQuery();
	         while(resultSet.next())
	         {
	              String a=resultSet.getString("EmpID");
	              String b=resultSet.getString("Ename");
	              String c=resultSet.getString("DeptID");
	              String d=resultSet.getString("Salary");
	              String e=resultSet.getString("Dname");
	              String f=resultSet.getString("Dlocation");
	              System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f);
	         }
		 } catch (SQLException e) {
			 System.out.println("Error while connecting to the database");
	 }
	}

}
