package com.cdac.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TCPServer {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		int portNumber = 5500;
		
		ServerSocket server = new ServerSocket(portNumber);
		System.out.println("Server is waiting for the client.");
		Socket socket = server.accept();
		System.out.println("Client is connected.");
		
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		
		String line = "";
		while ( !line.equals( "Stop"))
		{
			String strFromClient = dis.readUTF();
			System.out.println("Client Says :: "+strFromClient);
			System.out.println("Enter Server Reply :: ");
			line = scanner.nextLine();
			dos.writeUTF(line);
		}
		
		dis.close();
		dos.close();
		server.close();
		socket.close();
	}
}