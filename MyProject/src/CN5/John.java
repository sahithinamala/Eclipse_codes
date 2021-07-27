package CN5;

import java.io.*;
import java.net.*;
 class ToJohn{
	 public static void main(String[]args) throws Exception{
		 Socket client_socket = new Socket("Localhost",1234);
		 try {
			 System.out.println("Addition of 2 numbers:");
			 while(true) {
				 String Str = "";
				BufferedReader user_input = new BufferedReader(new InputStreamReader(System.in));
				DataOutputStream client_out = new DataOutputStream(client_socket.getOutputStream());
				BufferedReader server_input = new BufferedReader(new InputStreamReader(client_socket.getInputStream()));
				for(int i=1;i<=2;i++) {
					System.out.println("Enter number :");
					Str =Str +  user_input.readLine();
				}
				client_out.writeBytes(Str + "\n");
				String Str3 = server_input.readLine();
				System.out.println("Sum is:"+Str3);
				client_socket.close();
			 }
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
 }