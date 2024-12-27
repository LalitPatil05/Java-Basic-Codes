import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.ResultSet;

public class ResultSetDemo
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
		Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		System.out.println("Created Statement Object...!!");

		// Step 4 : Execute the Query
		ResultSet rs = stmt.executeQuery("select ID, NAME from student");

		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}

		rs.first();
		System.out.println("First Row Data : "+rs.getInt(1)+"\t"+rs.getString(2));

		rs.last();
		System.out.println("Last Row Data : "+rs.getInt(1)+"\t"+rs.getString(2));
		
		// Update Data Using ResultSet Object
		rs.absolute(4);
		System.out.println("Fourth Row Data : "+rs.getInt(1)+"\t"+rs.getString(2));
		rs.updateString("NAME","Rohit");
		rs.updateRow();

		// Insert Data Using ResultSet Object
		rs.moveToInsertRow();
		rs.updateInt("ID",4);
		rs.updateString("NAME","Nitin");
		rs.insertRow();
		rs.moveToCurrentRow();

		System.out.println("Execute the Query..!!");

		// Step 5 : Close the Connection
		con.close();
		System.out.println("Connection is Closed...!!");
		
		}
		catch(SQLException ex)
		{
			System.out.println("Error in Connectivity..!!"+ex.getMessage());
		}

	}
}