import java.sql.*;
public class DBInsert{
	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		Statement stmt = con.createStatement();
		int a =	stmt.executeUpdate("insert into emp values(100,'jain',10000.00)");
		System.out.println(a);	
	}
}
