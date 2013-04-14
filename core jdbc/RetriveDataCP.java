import java.sql.*;  // RetriveData using Statement
import javax.sql.*;  // RetriveData using Statement
import java.util.*;
import javax.naming.*;

class RetriveDataCP{
	public static void main(String[] args) throws Exception{
		Hashtable h = new Hashtable();
    h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
    h.put(Context.PROVIDER_URL,"t3://localhost:7001");
    h.put(Context.SECURITY_PRINCIPAL,"honey");
    h.put(Context.SECURITY_CREDENTIALS,"saxgau301");
    Context c = new InitialContext(h);
    Object o = c.lookup("mypool");
    DataSource ds = (DataSource)o;
    Connection con = ds.getConnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from emp");
		while(rs.next()){
			int eno = rs.getInt(1);
			String ename = rs.getString(2);
			double esal = rs.getDouble(3);
			System.out.println("Eno :"+eno);
			System.out.println("Ename :"+ename);
			System.out.println("Esal :"+esal);		
			System.out.println();
		}
		
	}

}