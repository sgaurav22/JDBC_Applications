import java.util.*;
import java.sql.*;
// JDBC Txn Exmaple
public class EnterEmployeeDetails{
  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    System.out.println("Enter employee number : ");
    int eno = s.nextInt();
    
    
    System.out.println("Enter employee name : ");
    String ename = s.next();
    
    System.out.println("Enter employee salary : ");
    double esal = s.nextDouble();
    
    System.out.println("Enter employee street : ");
    String estreet = s.next();
    
    System.out.println("Enter employee state : ");
    String estate = s.next();
    
    System.out.println("Enter employee country : ");
    String ecountry = s.next();
    
    System.out.println("Employee Details : ");
    System.out.println("-----------------");
    System.out.println("Eno : "+eno);
    System.out.println("Ename : "+ename);    
    System.out.println("Esal : "+esal);
    System.out.println("EStreet : "+esal);
    System.out.println("EState : "+esal);
    System.out.println("ECountry : "+esal);
    System.out.println("-----------------");
    
    Driver driver = null;
    Connection con = null;
    PreparedStatement pstmt1 = null;
    PreparedStatement pstmt2 = null;
    
    try{        
    driver = new oracle.jdbc.driver.OracleDriver();
    DriverManager.registerDriver(driver);
    con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","bms","root");
    con.setAutoCommit(false);
    String query1 = "insert into emp values(?,?,?)";
    System.out.println("Query 1 : "+query1);
    pstmt1 = con.prepareStatement(query1);
    pstmt1.setInt(1,eno);
    pstmt1.setString(2,ename);
    pstmt1.setDouble(3,esal);
    pstmt1.executeUpdate();
    
    String query2 = "insert into empaddr values(?,?,?,?)";
    System.out.println("Query 2 : "+query2);
    pstmt2= con.prepareStatement(query2);
    pstmt2.setInt(1,eno);
    pstmt2.setString(2,estreet);
    pstmt2.setString(3,estate);
    pstmt2.setString(4,ecountry);
    pstmt2.executeUpdate();
    con.commit();
    con.close();
    System.out.println("Data inserted successfully......");
    }
    catch(SQLException e){
      try{
        con.rollback();
        con.close();
        e.printStackTrace();
      }catch(SQLException e1){
        e1.printStackTrace();
      }
    }
    finally{
      try{
        con.close();
      }
      catch(SQLException e2){
        e2.printStackTrace();
      }
    }
  }
}