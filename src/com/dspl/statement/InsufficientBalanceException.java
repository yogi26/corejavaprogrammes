package com.dspl.statement;

public class InsufficientBalanceException extends ATMException
{
	public InsufficientBalanceException(String s)
	{
		super(s);
	}
}
