import java.sql.*;

public class SearchEmployee{
	public static void main(String[] args) throws SQLException{
		System.out.println("Search By Eno : ");
		String eno = System.console().readLine();
		
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "select * from emp where eno=?";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setString(1,eno);
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()){
			System.out.println("Eno : "+rs.getInt(1));
			System.out.println("Ename : "+rs.getString(2));
			System.out.println("Esal : "+rs.getDouble(3));
		}
		else{
			System.out.println("Record Not Found");
		}
	}

}