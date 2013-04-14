import org.apache.commons.dbcp.*;
import java.sql.*;

public class DBCPExample{
  public static void main(String[] args) throws Exception{
    BasicDataSource bds = new BasicDataSource();
    bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
    bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
    bds.setUsername("bms");
    bds.setPassword("root");
    bds.setInitialSize(5);
    
    System.out.println("Connection pool is ready");
    Connection con = bds.getConnection();
    System.out.println("Conection : "+con);
    System.in.read();
    System.in.read();
    
  }
}