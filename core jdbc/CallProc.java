import java.sql.*;

public class CallProc{
	public static void main(String[] args) throws SQLException{
		System.out.println("Enter Eno : ");
		String eno = System.console().readLine();
		
		System.out.println("Enter Ename : ");
		String ename = System.console().readLine();
		
		System.out.println("Enter Salary : ");
		String esal = System.console().readLine();
		
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		// ***** Calling procedure without any parameter *******
		
		//CallableStatement cstmt = con.prepareCall("{call myproc()}");
		//cstmt.execute();	
		
		// ***** Calling procedure with IN parameters only ******
		CallableStatement cstmt = con.prepareCall("{call in_myproc(?,?,?)}");
		cstmt.setString(1,eno);
		cstmt.setString(2,ename);
		cstmt.setString(3,esal);
		cstmt.execute();		
	}
	
}