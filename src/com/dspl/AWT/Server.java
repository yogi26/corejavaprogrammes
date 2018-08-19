package com.dspl.AWT;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;

import com.dspl.SocketProgramming.SocketServer;
public class Server extends Frame implements WindowListener,ActionListener
{
	TextField text;
	TextArea tarea;
	Button button,button2;
	
	public Server() throws IOException
	{
		setLayout(null);
		addWindowListener(this);
		text=new TextField();
		tarea=new TextArea();
		button=new Button("Send");
		button2=new Button("Sign Out");
		tarea.setBounds(60, 60, 300, 200);
		text.setBounds(60, 320, 200, 100);
		button.setBounds(60, 500, 100, 50);
		button2.setBounds(60, 560, 100, 50);
		
//		ss=new ServerSocket(1212);
//		s=ss.accept();
//		obj=s.getOutputStream();
//		dout=new DataOutputStream(obj);
//		java.io.InputStream in=s.getInputStream();
//		DataInputStream din=new DataInputStream(in);
		
		add(tarea);
		add(button);
		add(text);
		add(button2);
//		SocketServer s = new SocketServer();
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button)
		{
			
			System.out.println();
		}
		
	}
	public static void main(String args[]) throws IOException
	{
		System.out.println("Main");
		Server s=new Server();
		System.out.println("server");
		s.setName("Server Side");
		s.setSize(600,600);
		s.setVisible(true);
		
	}
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		try {
			SocketServer s = new SocketServer();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
