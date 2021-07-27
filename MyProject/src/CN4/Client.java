package CN4;

import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
try{	
Socket socket=new Socket("localhost",5000);
	
DataOutputStream dOUT=new DataOutputStream(socket.getOutputStream());

dOUT.writeUTF(sc.nextLine());
dOUT.flush();

dOUT.close();
socket.close();

}catch(Exception e){
	System.out.println(e);
}
}
}

