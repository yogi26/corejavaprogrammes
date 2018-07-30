package com.dspl.statement;

public class ThreadApplication {

	public static void main(String[] args) 
	{
		
		ThreadDemo th1=new ThreadDemo("A");
		ThreadDemo th2=new ThreadDemo("B");
		ThreadDemo th3=new ThreadDemo("1");
		Thread t1,t2,t3;
		
		t1=new Thread(th1);
		t2=new Thread(th2);
		t3=new Thread(th3);
		
	
		
		t1.start();
		t2.start();
		t3.start();
	}

}
