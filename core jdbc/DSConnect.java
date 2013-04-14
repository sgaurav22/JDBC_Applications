import javax.naming.*;
import java.util.*;
public class DSConnect{
  public static void main(String[] args) throws Exception{
    Hashtable h = new Hashtable();
    h.put(Context.INITIAL_CONTEXT_FACTORY,"weblogic.jndi.WLInitialContextFactory");
    h.put(Context.PROVIDER_URL,"t3://localhost:7001");
    h.put(Context.SECURITY_PRINCIPAL,"honey");
    h.put(Context.SECURITY_CREDENTIALS,"saxgau301");
    Context c = new InitialContext(h);
    //Context c1 = c.createSubcontext("ram");
    //Context c2 = c1.createSubcontext("sham");
    //c2.bind("rollno","1");
    //c.rebind("ram.sham.rollno","2");
    
    //String s = (String)c.lookup("ram.sham.rollno");
    //  c.unbind("ram");
    System.out.println(c);
  }  
}