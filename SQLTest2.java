package satvikIsGood;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class SQLTest2 {


	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;


	/*
	 * SEE BELOW
	 * THIS IS TO CREATE A CONNECTION TO THE DATABASE
	 * \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
	 */
	private static Connection getConnection()
	{
		Connection con=null;
		try 
		{
			//com.mysql.jdbc.Driver
			Class.forName("com.mysql.jdbc.Driver.class");
			String url = "jdbc:mysql:mysqltest.ctpoxoel2pz9.us-east-1.rds.amazonaws.com/movies";
			String user = "awsmysql";
			String password = "Z1j1G3Uo";
			con = DriverManager.getConnection(url, user, password);
			System.out.println("success");
		}
		catch (SQLException | ClassNotFoundException e)
		{
			System.out.println(e.getMessage());
			System.out.println("not good");
			System.exit(0);

		}
		return con;
	}
	/*
	 * THIS IS TO CREATE A CONNECTION TO THE DATABASE
	 * \/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\/\
	 * SEE ABOVE
	 */

	public static void main(String[] args) {

		Connection con2=null;
		con2=getConnection();
		System.println("We completed the task here");

	}
}

