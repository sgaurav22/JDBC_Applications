import java.sql.*;

public class BatchUpdateStmt{
  public static void main(String[] args) throws Exception{
    Driver d = new oracle.jdbc.driver.OracleDriver();
    DriverManager.registerDriver(d);
    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
    Statement stmt = con.createStatement();
    stmt.addBatch("insert into emp values(13,'ajay',13000)");
    stmt.addBatch("insert into emp values(14,'ajay',14000)");
    stmt.addBatch("insert into emp values(15,'ajay',15000)");
    int[] a = stmt.executeBatch();
    for(int value : a){
      System.out.println("Value : "+value);
    }
  }
}