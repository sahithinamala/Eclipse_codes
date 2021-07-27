package Client;



import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Client_side {
	@SuppressWarnings("resource")
	public static void main(String[]args)throws UnknownHostException,IOException,Exception{
        Scanner sc = new Scanner(System.in);
        int portnumber = sc.nextInt();
        String host = "local host";
        Socket clientsoc=new Socket(host,portnumber);
        try (DataOutputStream dos = new DataOutputStream(clientsoc.getOutputStream())) {
            dos.writeUTF(sc.nextLine());
            dos.flush();
             
        }
          
        }

}
