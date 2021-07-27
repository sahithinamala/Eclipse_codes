import java.io.*;
import java.net.*;

public class Server {
public static void main(String[] args){
try{
ServerSocket ssocket=new ServerSocket(5000);
Socket socket=ssocket.accept();

DataInputStream DIStream=new DataInputStream(s.getInputStream());

String	str=(String)DIStream.readUTF();
System.out.println("message= "+str);

ssocket.close();

}catch(Exception e){
	System.out.println(e);
}
}
}

