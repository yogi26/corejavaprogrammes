package com.dspl.statement;
public class GetArray 
{
	public void reverseShow(int arr[])
	{
		System.out.print("\nReversed Array  : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public void showArray(int arr[])
	{
		System.out.print("\nOriginal Array  : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
