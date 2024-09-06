import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import static java.lang.System.out;

public class Server
  {  
   public static void main(String...ar)throws Exception
 { 
  Registry reg=LocateRegistry.createRegistry(2003);
  out.println("Server is Ready");
  CheckLogin cl=new CheckLogin();
  reg.bind("AUTH",cl);
 }
}
       


  