package ThreadPractice;

public class Bank implements Runnable
{
	static double tot_amt;
	public Bank(double amt)
	{
		Bank.tot_amt=amt;
	}
	public void run()
	{
			withdraw(400);
	}
	public synchronized void withdraw(double with_amt)
	{
		if(tot_amt<with_amt)
		{
			System.out.println("Insufficient Balance");
		}
		else
		{
			tot_amt-=with_amt;
			System.out.println(Thread.currentThread().getName()+" Withdraw :"+with_amt);
			System.out.println("Remaining Balance : "+tot_amt);
		}
	}
}
