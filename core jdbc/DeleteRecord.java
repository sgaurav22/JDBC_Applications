import java.sql.*;
public class DeleteRecord{
	public static void main(String[] args) throws SQLException{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "delete from emp where ename='honey'";
		System.out.println("Query : "+query);
		Statement stmt = con.createStatement();
		int numberOfRowsEffected = stmt.executeUpdate(query);
		System.out.println("Number of rows updated : "+numberOfRowsEffected);
	}
}