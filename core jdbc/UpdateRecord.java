import java.sql.*;

public class UpdateRecord{
	public static void main(String[] args) throws SQLException{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		Statement stmt = con.createStatement();
		String query = "update emp set ename='money' where eno='100'";
		System.out.println("Query :"+query);
		int a = stmt.executeUpdate(query);
		System.out.println("No Of Records Updated : "+a);
	
	}
}