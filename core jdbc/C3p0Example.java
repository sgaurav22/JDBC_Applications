import com.mchange.v2.c3p0.*;
import java.sql.*;

public class C3p0Example{
  public static void main(String[] args) throws Exception{
    ComboPooledDataSource cp = new ComboPooledDataSource();
    cp.setDriverClass("oracle.jdbc.driver.OracleDriver");
    cp.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
    cp.setUser("bms");
    cp.setPassword("root");
    cp.setInitialPoolSize(5);
    cp.setMaxPoolSize(7);
    Connection con1 = cp.getConnection();
    Connection con2 = cp.getConnection();
    Connection con3 = cp.getConnection();
    Connection con4 = cp.getConnection();
    Connection con5 = cp.getConnection();
    Connection con6 = cp.getConnection();
    Connection con7 = cp.getConnection();
    Connection con8 = cp.getConnection();
    
    //System.out.println(con);
    System.in.read();
    System.in.read();
    
  }
}