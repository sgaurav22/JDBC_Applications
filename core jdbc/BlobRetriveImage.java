import java.sql.*;		// RetriveRecords using PreparedStatement
import java.io.*;

public class BlobRetriveImage{
	public static void main(String[] arg) throws Exception{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "select * from empimage where eno=?";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setInt(1,101);
    ResultSet rs = pstmt.executeQuery();
    while(rs.next()){
    FileOutputStream fos = new FileOutputStream("sample.jpg");
    fos.write(rs.getBytes(2));
    fos.close();
    }
  }
}
		