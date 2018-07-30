package ThreadPractice;

public class AddRemoveArray implements Runnable
{
	int i;
	int arr[]=new int[5];
	public synchronized void run()
	{
		for(int j=0;j<5;j++)
		{
			add();
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			notifyAll();
			remove();
			try
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			notifyAll();
		}
	}
	public void add()
	{
		for(i=0;i<5;i++)
		{
			arr[i]=i;
		}
	}
	public void remove()
	{
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]+" ");
		}
		i=0;
	}
}
