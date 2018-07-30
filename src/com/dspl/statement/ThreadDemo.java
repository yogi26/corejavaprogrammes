package com.dspl.statement;

public class ThreadDemo implements Runnable
{ 
	String s;
	
	ThreadDemo(String s)
	{
		this.s=s;
	}
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(s);	
		}
	}
}
