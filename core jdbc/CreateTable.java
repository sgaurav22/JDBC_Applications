import java.sql.*;

public class CreateTable{
	public static void main(String[] args) throws Exception{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		Statement stmt = con.createStatement();
		int a = stmt.executeUpdate("create table student(sno number(5),sname varchar(20),spercetage number(3,2) )");
		System.out.println(a);	
	}
}
