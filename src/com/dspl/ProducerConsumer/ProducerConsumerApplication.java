package com.dspl.ProducerConsumer;

public class ProducerConsumerApplication 
{	
	public static void main(String []args)
	{
		SharedObject sh=new SharedObject();
		new Producer(sh);
		new Consumer(sh);

	}
}
