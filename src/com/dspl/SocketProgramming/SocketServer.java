package com.dspl.SocketProgramming;
import java.io.*;
import java.net.*;
import java.util.*;
public class SocketServer
{
	ServerSocket ss;
	Socket s;
	public SocketServer() throws IOException{
		ss=new ServerSocket(1212);
		s=ss.accept();
	}
	public String receiveMessage() throws IOException{
		java.io.InputStream in=s.getInputStream();
		DataInputStream din=new DataInputStream(in);
		return din.readUTF();
	}
	
	public void sendMessage(String msg) throws IOException
	{
//		System.out.println("Server Side");
		
		OutputStream obj=s.getOutputStream();
		DataOutputStream dout=new DataOutputStream(obj);
//		System.out.println("Eneter Text");
//		Scanner sc=new Scanner(System.in);
//		String str;
		dout.writeUTF(msg);
//		str=din.readUTF();
//		while(true)
//		{
//			str=sc.nextLine();
//			if(str.equals("Exit"))
//				break;
//			dout.writeUTF(str);
//			str=din.readUTF();
//			
//			System.out.println(str);
//		}
		
	}
}
