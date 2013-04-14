import java.sql.*;

public class CallAdditionProcedure{
	public static void main(String[] args) throws SQLException{
		System.out.println("Enter First no : ");
		String no1 = System.console().readLine();
		
		System.out.println("Enter Second no : ");
		String no2 = System.console().readLine();
	
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		// ******* Calling procedure with IN and OUT both parameters *******
		CallableStatement cstmt = con.prepareCall("{call addition(?,?,?)}");
		cstmt.setString(1,no1);
		cstmt.setString(2,no2);
		cstmt.registerOutParameter(3,Types.INTEGER);
		cstmt.execute();	
		System.out.println(cstmt.getString(3));
	}

}