package com.dspl.statement;

public class ATM
{
	double tot_amt;
	public ATM()
	{
		tot_amt=500;
	}
	public boolean isSufficientBalance(double amount)
	{
		if(amount>tot_amt)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public boolean isValidAmount(double amount)
	{
		if(amount%100==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void withdrawAmout(double amount)throws ATMException //throws InsufficientBalanceException,InvalidBalanceException
	{		
			if(isSufficientBalance(amount))
			{
				if(isValidAmount(amount))
				{
					tot_amt=tot_amt-amount;
					System.out.println("Your current balance is  "+(tot_amt));
				}
				else
				{
					throw new InvalidBalanceException("Invalid Amount entered");
				}
			}
			else
			{
				throw new InsufficientBalanceException("Insuficient Balance in your account");
			}
	}

}
