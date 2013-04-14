import java.sql.*;
public class DBConnect{
	public static void main(String[] args) throws SQLException{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		System.out.println("Connection has been established successfully.....");
	}
}