package com.dspl.AWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.*;
import java.util.*;
import java.io.*;
public class ClientApplication extends Frame implements ActionListener,WindowListener,Runnable
{
	TextArea txt1;
	TextField  txt2;
	Button button;
	Label label1,label2;
	Socket s=new Socket("localhost",888);
	DataInputStream din=new DataInputStream(s.getInputStream());
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());
	String str=new String();
	Thread t;
	public ClientApplication()throws Exception
	{
		setLayout(null);
		t=new Thread(this);
		t.start();
		label1=new Label("Server says ");
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
		
		din=new DataInputStream(s.getInputStream());		
		
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
			System.out.println("hiiee");
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
		ClientApplication client=new ClientApplication();
		client.setTitle("Client");
		client.setSize(400,400);
		client.setVisible(true);
		
	}
}
