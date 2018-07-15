package com.dspl.statement;

public class sort {

	public static void main(String[] args) 
	{
		int i,j,t;
		int arr[]={9,8,7,6,5,4,3,2,1};
		for(i=0;i<9;i++)
		{
			for(j=0;j<9-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(i=0;i<9;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
