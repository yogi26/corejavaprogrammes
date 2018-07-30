package ThreadPractice;

public class AddRemoveApplication {

	public static void main(String[] args)throws Exception
	{
		AddRemoveArray obj=new AddRemoveArray();
		
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
	
			t1.start();
			t2.start();

	}

}
