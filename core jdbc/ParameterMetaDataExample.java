import java.sql.*;

public class ParameterMetaDataExample{
  public static void main(String[] args) throws Exception{
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
    PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
    ParameterMetaData pmd = pstmt.getParameterMetaData();
    System.out.println(pmd.getParameterCount());
  }
}