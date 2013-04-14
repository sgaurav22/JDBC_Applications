import java.sql.*;  // RetriveData using Statement
import oracle.jdbc.driver.*;

class RetriveDataS{
	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521","bms","root");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		while(rs.next()){
			int eno = rs.getInt(1);
			String ename = rs.getString(2);
			double esal = rs.getDouble(3);
			System.out.println("Eno :"+eno);
			System.out.println("Ename :"+ename);
			System.out.println("Esal :"+esal);		
			System.out.println();
		}
		
	}

}