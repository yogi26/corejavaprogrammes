package ThreadPractice;

public class Puller extends Thread
{
	SharedArray obj=null;
	public Puller(SharedArray obj)
	{
		this.obj=obj;	
		this.setName("Puller");
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			try {
				obj.pull();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Pull Ends");

	}
}
