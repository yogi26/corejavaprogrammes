package com.dspl.AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.*;
public class Client extends Frame implements ActionListener
{
	TextField text;
	TextArea tarea;
	Button button,button2;
	Socket s;
	DataInputStream din;
	OutputStream obj;
	public Client() throws UnknownHostException, IOException
	{
		setLayout(null);
		
		text=new TextField();
		tarea=new TextArea();
		button=new Button("Send");
		button2=new Button("Sign Out");
		
		tarea.setBounds(60, 60, 300, 200);
		text.setBounds(60, 320, 200, 100);
		button.setBounds(60, 500, 100, 50);
		button2.setBounds(60, 560, 100, 50);
		add(tarea);
		add(button);
		add(text);	
		add(button2);
		
		s=new Socket("localhost",1212);
		java.io.InputStream in=s.getInputStream();
		din=new DataInputStream(in);
		obj=s.getOutputStream();
		DataOutputStream dout=new DataOutputStream(obj);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button)
		{
			System.out.println("Hello");
		}
		if(ae.getSource()==button2)
		{
			try 
			{
				s.close();
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String args[]) throws UnknownHostException, IOException
	{
		Client s=new Client();
		s.setName("Client Side");
		s.setSize(600,600);
		s.setVisible(true);
		
	}
}
