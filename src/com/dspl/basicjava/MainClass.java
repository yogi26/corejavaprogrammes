package com.dspl.basicjava;

public class MainClass 
{
	public static void main(String args[])
	{
		SavingAccount saving = new SavingAccount();
		CurrentAccount current = new CurrentAccount();
		saving.calculate();
		current.calculate();
	}
}
