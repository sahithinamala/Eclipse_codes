package Server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_side {
	public static void main(String[]args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ServerSocket ssocket=new ServerSocket(sc.nextInt());
		Socket socaccept = ssocket.accept();
		DataInputStream DIS = new DataInputStream(socaccept.getInputStream());
		String Msg = DIS.readUTF();
		System.out.println("Message is  " + Msg);
	}


}
