package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main 
{
	public static void main(String[]args) throws ClassNotFoundException
	{
	String url = "jdbc:mysql://localhost:3306/cricketdb";  // Replace 'testdb' with your database
    String user = "root";  // Replace with your MySQL username
    String password = "1234";  // Replace with your MySQL password

    try {
    	Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println("✅ Connection successful!");
        conn.close();
    } catch (SQLException e) {
        System.out.println("❌ Connection failed.");
        e.printStackTrace();
    }
	}
}
