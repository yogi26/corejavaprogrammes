package ThreadPractice;

public class BankApplication {

	public static void main(String[] args) 
	{	
		Bank b1;
		b1=new Bank(1000);
		
		
		Thread t1,t2,t3;
		t1=new Thread(b1,"t1");
		t2=new Thread(b1,"t2");
		t3=new Thread(b1,"t3");
		
		
		
		t1.start();
		t2.start();
		t3.start();
	
	}

}
