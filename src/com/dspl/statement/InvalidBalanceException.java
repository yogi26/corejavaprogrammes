package com.dspl.statement;

public class InvalidBalanceException extends ATMException
{
	public InvalidBalanceException(String s) 
	{
		super(s);
	}
}
