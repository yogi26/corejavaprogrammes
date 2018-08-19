package com.dspl.ProducerConsumer;

public class SharedObject 
{
	int i,val;
	int arr[]={-1,-1,-1,-1,-1};
	public synchronized void push(int val)
	{
		if(!isEmptyArray())
		{	
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			for(i=0;i<5;i++)
			{
				arr[i]=val;
				System.out.println("Push: "+val);
			}
		}
		notify();
	}
	public synchronized void pull()
	{
		if(isEmptyArray())
		{	
			try 
			{
				wait();
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			for(i=0;i<5;i++)
			{
				System.out.println("pull :"+arr[i]);
				arr[i]=-1;
			}
		}
		notify();
	}
	public boolean isEmptyArray()
	{
		int k=0;
		for(i=0;i<5;i++)
		{
			if(arr[i]!=-1)
			{
				k=1;
			}
		}
		if(k==0)
			return true;
		else
			return false;
	}
}
