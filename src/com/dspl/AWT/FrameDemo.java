package com.dspl.AWT;
import java.awt.*;
public class FrameDemo extends Frame 
{
	public FrameDemo()
	{
		setLayout(null);
		
		Label l=new Label("Hellooo");
		l.setBounds(50, 50, 80, 20);
		add(l);
		
		setSize(400,400);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		new FrameDemo();
	}
}
