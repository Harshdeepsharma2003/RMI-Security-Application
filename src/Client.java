import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import static java.lang.System.out;
import java.util.Scanner;

public class Client {
 public static void main(String[]args)throws Exception
 { 
      Scanner sc=new Scanner(System.in);
      out.println("Enter Server Name");
      String serverName=sc.next();
      out.println("Enter Port No");
      int portNo=sc.nextInt();
      out.println("Enter unique id");
      String uniqueId=sc.next();
      out.println("Enter user id");
      String userId=sc.next();
      out.println("Enter password");
      String password=sc.next();
    
      Registry reg=LocateRegistry.getRegistry(serverName,portNo);
      LoginInterface li=(LoginInterface)reg.lookup(uniqueId);
      boolean result=li.check(userId,password);
      
      if(result)
      { 
           out.println("Hello world");
      }
      else
      { System.exit(0);}
      }
 }         
        
         

