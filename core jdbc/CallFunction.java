import java.sql.*;

public class CallFunction{
	public static void main(String[] args) throws SQLException{
		System.out.println("Enter First no : ");
		String no1 = System.console().readLine();
		
		System.out.println("Enter Second no : ");
		String no2 = System.console().readLine();
		
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		CallableStatement cstmt = con.prepareCall("{?=call add_number(?,?)}");		
		cstmt.registerOutParameter(1,Types.INTEGER);
		cstmt.setString(2,no1);
		cstmt.setString(3,no2);
		cstmt.execute();		
		System.out.println(cstmt.getString(1));
	}
	
}