package com.dspl.statement;

import java.util.Scanner;

public class Prime
{
	public void showPrime(int n)
	{
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Enter Number is Prime number");
		}
		else
		{
			System.out.println("Enter number is not a Prime number");
		}
	}
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		Prime p=new Prime();
		System.out.println("Enter number to check prime or not");
		int n=input.nextInt();
		p.showPrime(n);
		input.close();
	}

}
