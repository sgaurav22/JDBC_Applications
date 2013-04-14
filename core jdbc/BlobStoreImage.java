import java.sql.*;		// RetriveRecords using PreparedStatement
import java.io.*;

public class BlobStoreImage{
	public static void main(String[] arg) throws Exception{
		Driver d = new oracle.jdbc.driver.OracleDriver();
		DriverManager.registerDriver(d);
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
		String query = "insert into empimage values(?,?)";
    PreparedStatement pstmt = con.prepareStatement(query);
    pstmt.setInt(1,101);
    File f = new File("Desert.jpg");
    FileInputStream fis = new FileInputStream(f);
    pstmt.setBinaryStream(2,fis,(int)f.length());
    pstmt.executeUpdate();
  }
}
		