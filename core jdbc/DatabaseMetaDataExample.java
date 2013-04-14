import java.sql.*;

public class DatabaseMetaDataExample{
  public static void main(String[] args) throws Exception{
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
    DatabaseMetaData dbmd = con.getMetaData();
    System.out.println(dbmd.getDatabaseProductName());
    System.out.println(dbmd.getDatabaseMajorVersion());
    System.out.println(dbmd.getDatabaseMinorVersion());
  }

}