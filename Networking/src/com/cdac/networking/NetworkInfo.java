package com.cdac.networking;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class NetworkInfo {
	
	public static void main(String[] args) throws UnknownHostException, MalformedURLException {
		InetAddress inetAddress = InetAddress.getByName("google.com");
		System.out.println("Host Name : "+inetAddress.getHostName());
		System.out.println("Host Address : "+inetAddress.getHostAddress());
		
		inetAddress = InetAddress.getByName("facebook.com");
		System.out.println("Host Name : "+inetAddress.getHostName());
		System.out.println("Host Address : "+inetAddress.getHostAddress());
		
		URL url = new URL("http://localhost:8080/testApp");
		System.out.println("Protocol : "+url.getProtocol());
		System.out.println("Host : "+url.getHost());
		System.out.println("Port No : "+url.getPort());
		System.out.println("Path : "+url.getPath());
		System.out.println("Default Port : "+url.getDefaultPort());
		System.out.println("End of the Program");
	}
}
