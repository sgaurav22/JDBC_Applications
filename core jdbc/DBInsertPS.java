import java.sql.*;
public class DBInsertPS{
	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
		pstmt.setInt(1,5);
		pstmt.setString(2,"kaushik");
		pstmt.setDouble(3,60000.00);
		int a =	pstmt.executeUpdate();
		System.out.println(a);	
	}
}
