package com.dspl.statement;

public class MainATMClass
{
	public static void main(String[] args) throws ATMException
	{
		ATM user=new ATM();
		
//		try
//		{
			user.withdrawAmout(300);
			user.withdrawAmout(150);
//		}
//		catch (InsufficientBalanceException | InvalidBalanceException is0) 
//		{
//			is0.printStackTrace();
//		}
//		catch(ATMException ae){
//			
//		}
//		
		System.out.println("Program Ends");
	}
}
