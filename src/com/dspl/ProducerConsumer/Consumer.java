package com.dspl.ProducerConsumer;

public class Consumer implements Runnable
{
	Thread t2;
	SharedObject sh;
	public Consumer(SharedObject sh) 
	{	
		this.sh=sh;
		t2=new Thread(this,"Consumer");
		t2.start();
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			sh.pull();
			try
			{
				Thread.sleep(3000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
