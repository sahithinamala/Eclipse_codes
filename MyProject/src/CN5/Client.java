package CN5;

import java.io.*;
import java.net.*;
import java.lang.*;
class ClientSum{
	public static void main(String[]args) throws Exception{
		ServerSocket server_socket = new ServerSocket(1234);
		while(true) {
			Socket Listen_Socket = server_socket.accept();
			System.out.println("Server Start...");
			String Str1 = " ";
			String[]temp;
			String del = "#";
			BufferedReader user_input = new BufferedReader(new InputStreamReader(Listen_Socket.getInputStream()));
			DataOutputStream server_output = new DataOutputStream(Listen_Socket.getOutputStream());
			Str1 = user_input.readLine();
			temp = Str1.split(del);
			double sum = 0.0;
			for(int i=0;i<temp.length;i++) {
				float num = Float.parseFloat(temp[i]);
				sum = sum+num;
			}
			String Str2 = sum+"\n";
			server_output.writeBytes(Str2);
			System.out.println("Output send ...");
		}
	}
}