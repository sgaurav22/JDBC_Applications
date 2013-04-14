import java.sql.*;
public class RegisterDriver{
	public static void main(String[] arg) throws SQLException
	{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		System.out.println("Driver has been registered succesfully.....");
	}
}