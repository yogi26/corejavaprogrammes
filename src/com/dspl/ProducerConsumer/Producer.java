package com.dspl.ProducerConsumer;

public class Producer implements Runnable
{
	Thread t1;
	SharedObject sh;
	public Producer(SharedObject sh) 
	{	
		this.sh=sh;
		t1=new Thread(this,"Producer");
		t1.start();
	}
	public void run()
	{	
		for(int i=0;i<6;i++)
		{
			sh.push(i+1);
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
