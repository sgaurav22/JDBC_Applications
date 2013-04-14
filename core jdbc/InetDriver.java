import java.sql.*;	// Set CLASSPATH to Oranxo.jar
public class InetDriver{
	public static void main(String[] args) throws SQLException{
		Driver d = new com.inet.ora.OraDriver();
		DriverManager.registerDriver(d);
		DriverManager.getConnection("jdbc:inetora:localhost:1521:xe","bms","root");
		System.out.println("Connetion established using Inet Driver");
	}
}