package ThreadPractice;

public class Pusher extends Thread
{
	SharedArray obj=null;
	public Pusher(SharedArray obj)
	{
		this.obj=obj;
		this.setName("Pusher");
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				obj.push(i+1);
				Thread.currentThread().sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		System.out.println("Push Ends");
	}
}
