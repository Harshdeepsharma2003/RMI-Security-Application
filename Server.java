import static java.lang.System.out;
import java.net.Socket;
import java.net.ServerSocket;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Scanner;
class Server
{  static public void main(String...ar)throws Exception
  {
ServerSocket ss=new ServerSocket(2000);
out.println("Server is ready");

Socket socket=ss.accept();//request

InputStreamReader isr=new InputStreamReader(socket.getInputStream());
BufferedReader br=new BufferedReader(isr);

while(true)
 {
   String data=br.readLine();
 if(data.equals("bye bye"))
 break;
 out.println(data);
  }
  }
}









