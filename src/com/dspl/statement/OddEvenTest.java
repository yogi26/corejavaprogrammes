package com.dspl.statement;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		
		OddEven obj=new OddEven();
				
		System.out.println("Please enter N numbers");
		int n=input.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Please enter"+n+" numbers");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		obj.showOdd(arr);
		obj.showEven(arr);
		input.close();
	}

}
