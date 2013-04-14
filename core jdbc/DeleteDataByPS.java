import java.sql.*;

public class DeleteDataByPS{
	public static void main(String[] args) throws SQLException{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "delete from emp where eno>=?";
		System.out.println(query);
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1,3);
		int a = pstmt.executeUpdate();
		System.out.println("No of rows deleted = "+a);
	}
}