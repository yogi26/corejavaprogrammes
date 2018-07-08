package com.dspl.statement;

public class Pattern1 
{
	public static void main(String[] args)
	{
		int i,j,sp,k=0;
		for(i=4;i>0;i--)
		{
			for(sp=0;sp<k;sp++)
			{
				System.out.print(" ");
			}
			for(j=0;j<i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			k++;
		}
	}
}
