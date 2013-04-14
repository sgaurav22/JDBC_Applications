import java.sql.*;		// RetriveRecords using PreparedStatement

public class RetriveRecordsPS{
	public static void main(String[] arg) throws SQLException{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "select * from emp where eno=?";
		System.out.println("Query :"+query);
		PreparedStatement pstmt = con.prepareStatement(query);						
		pstmt.setInt(1,2);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()){				
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
		}
	}
}