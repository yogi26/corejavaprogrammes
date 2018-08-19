package com.dspl.SocketProgramming;

import java.util.*;
import java.io.*;
import java.net.*;

public class SocketClient 
{	Socket s;
	public SocketClient() throws UnknownHostException, IOException{
		s=new Socket("localhost",1212);
		
	}
	
	
	
	
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		System.out.println("Client Side");
		Socket s=new Socket("localhost",1212);
		java.io.InputStream in=s.getInputStream();
		DataInputStream din=new DataInputStream(in);
		OutputStream obj=s.getOutputStream();
		DataOutputStream dout=new DataOutputStream(obj);
		String str;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			str=new String(din.readUTF());
			System.out.println(str);
			str=sc.nextLine();
			if(str.equals("Exit"))
				break;
			dout.writeUTF(str);
		
		}
		s.close();
		in.close();
		dout.close();
		
	}
}
