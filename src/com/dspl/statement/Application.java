package com.dspl.statement;

import java.util.Scanner;

public class Application {

	public static void main(String[] args)
	{
		GetArray array=new GetArray();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter size of array");
		int size=input.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Please enter "+size+" numbers");
		for(int i=0;i<size;i++)
		{
			arr[i]=input.nextInt();
		}
		array.showArray(arr);
		array.reverseShow(arr);
		input.close();	
	}

}
