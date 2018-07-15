package com.dspl.statement;

public class Consecutive {

	public static void main(String[] args)
	{
		char arr[]={'a','a','a','b','c','c','c','c','d','e','e','g','g','h','h','a'};
		int i,len=arr.length,k=0,j,f=0;
		char ch[]=new char[13];
		
		
		
		for(i=1;i<len;i++)
		{
			if(arr[i-1]==arr[i])
			{
				ch[k++]=arr[i];
			}
		}//This loop gives only double characters
		//System.out.println(ch);
		for(i=0;i<k;i++)
		{
			char c=ch[i];
			for(j=i+1;j<k;j++)
			{
				if(c==ch[j])
				{
					f=1;
					break;
				}
				else
				{	
					f=0;
				}
			}
			if(f==0)
			{
				System.out.println(ch[i]);	
			}
		}//this gives consecutive values
	}

}
