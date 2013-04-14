import java.sql.*;

public class BatchUpdatePS{
  public static void main(String[] args) throws Exception{
    Driver d = new oracle.jdbc.driver.OracleDriver();
    DriverManager.registerDriver(d);
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");                                  
    PreparedStatement pstmt = con.prepareStatement("delete from emp where esal=?");
    pstmt.setString(1,"13000");
    pstmt.addBatch();
    pstmt.setString(1,"14000");
    pstmt.addBatch();
    pstmt.setString(1,"15000");
    pstmt.addBatch();
    int[] a = pstmt.executeBatch();
    System.out.println(a.length);    
  }
}