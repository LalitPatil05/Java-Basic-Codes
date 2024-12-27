import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
// import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DBConn
{
	public static void main(String args[])
	{
		try
		{

		// Step 1 : Register the Driver
		
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("Driver Registered Successfully..!!");
		
		// Step 2 : Get Connection

		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","system","admin");
		System.out.println("Connection Successfull..!! ID = "+con);

		// Step 3 : Create Statement Object

		//Statement stmt = con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?)");
		System.out.println("Created Statement Object...!!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID and Name : ");
		int id = sc.nextInt();
		String name = sc.next();

		pstmt.setInt(1,id);
		pstmt.setString(2,name);

		// Step 4 : Execute the Query

		//stmt.executeUpdate("create table student(id number(3),Name varchar2(10))");
		//stmt.executeUpdate("insert into student values("+id+",'"+name+"')");
		pstmt.executeUpdate();
		
		System.out.println("Execute the Query..!!");

		// Step 5 : Close the Connection

		con.close();
		System.out.println("Connection is Closed...!!");
		
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Connectivity..!!");
		}

	}
}