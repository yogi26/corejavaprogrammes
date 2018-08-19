package com.dspl.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.*;
import java.io.*;
public class ServerApplication extends Frame implements Runnable,ActionListener,WindowListener
{
	TextField txt2;
	TextArea txt1;
	Button button;
	Label label1,label2;
	ServerSocket ss=new ServerSocket(888);;
	Socket s=ss.accept();;
	DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	String str="",str1="";
	Thread t;
	public ServerApplication()throws Exception
	{
		setLayout(null);
		t=new Thread(this);
		t.start();
		
		label1=new Label("Client says ");
		label2=new Label("Me ");
		
		txt1=new TextArea();
		txt2=new TextField();
		
		button=new Button("Send");
		
		label1.setBounds(50, 50, 80, 20);
		label2.setBounds(50, 90, 80, 20);
		txt1.setBounds(150, 50, 150, 120);
		txt2.setBounds(150, 180, 150, 20);
		button.setBounds(80, 210, 80, 20);
		
		add(label1);
		add(label2);
		add(txt1);
		add(txt2);
		add(button);
		
		button.addActionListener(this);
		
		
		
		
		
		
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				
				str=str+din.readUTF();
				txt1.setText(str);
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
			
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==button)
		{	
			try
			{	
				dout.writeUTF(txt2.getText());
			}
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		
		
	}
	@Override
	public void windowActivated(WindowEvent e) 
	{
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		dispose();
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args)throws Exception
	{
		ServerApplication server=new ServerApplication();
		server.setTitle("Server");
		server.setSize(400,400);
		server.setVisible(true);
		
	}
}
