import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CheckLogin extends UnicastRemoteObject implements LoginInterface

{
  public CheckLogin() throws RemoteException
  {
  }
@Override
  public boolean check(String userid,String password)throws RemoteException
  {
   
      if(userid.equals("harshdeep")&&password.equals("harshdeep"))
      {
          return true;}
      else {
          return false;}
  }
      

}