import java.sql.*;

public class ResultSetMetaDataExample{
  public static void main(String[] args) throws Exception{
    DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("select * from emp");
    ResultSetMetaData rsmd = rs.getMetaData();
    for(int i = 1;i <= rsmd.getColumnCount();i++ ){
      System.out.println(rsmd.getColumnName(i));
      System.out.println(rsmd.getColumnType(i));
    }
  }

}