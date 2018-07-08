package com.dspl.statement;

public class OddEven 
{
	public void showOdd(int arr[])
	{
		System.out.print("Odd Numbers : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.print(arr[i]+"");
		}
	}
	
	public void showEven(int arr[])
	{
		System.out.print("\nEven Numbers : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+"");
		}
	}
}
