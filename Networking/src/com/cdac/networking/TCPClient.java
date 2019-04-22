package com.cdac.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner scanner = new Scanner(System.in);
		String ipAddress = "localhost";
		int portNumbe = 5500;
		Socket socket = new Socket(ipAddress, portNumbe);
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());

		String line = "";
		while ( !line.equals( "Stop"))
		{
			System.out.println("Send msg to Server :: ");
			line = scanner.nextLine();
			dos.writeUTF(line);
			String strFromServer = dis.readUTF();
			System.out.println("Server says :: "+strFromServer);
		}
		
		dis.close();
		dos.close();
		socket.close();
	}
}
