import static java.lang.System.out;
import java.net.Socket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.net.SocketException;
class Client
{  static public void main(String...ar)throws Exception
  {
  Scanner sc=new Scanner(System.in);
   out.println("Enter IP address to chat");
String iPAddress=sc.next();

Socket socket=new Socket(iPAddress,2000);
try
{
InputStreamReader isr=new 
InputStreamReader(System.in);//type karo-byte mai covert krta

BufferedReader br=new BufferedReader(isr);

PrintStream ps=new PrintStream(socket.getOutputStream());//

while(true)
 {
   String data=br.readLine();
   if(data==null)
   break;
  
   ps.println(data);
   }
   }

catch(SocketException ex)
{
  
}

}
}

