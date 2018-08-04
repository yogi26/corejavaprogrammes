package ThreadPractice;

public class AddRemoveApplication {

	public static void main(String[] args)throws Exception
	{	
			SharedArray sh=new SharedArray();
			Pusher t1=new Pusher(sh);
			Puller t2=new Puller(sh);

			t1.start();
			t2.start();

	}

}
