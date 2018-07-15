package com.dspl.statement;

public class even 
{
	public static void main(String[] args)
	{
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String str2="A B C";
		StringBuilder str3=new StringBuilder();
		int f=0;
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str2.charAt(i)==str.charAt(j))
				{
					str3.append(str.charAt(j+3));
					f++;
					break;	
				}
				else
				{
					f=0;
				}
			}
			if(f==0)
			{
				str3.append(str2.charAt(i));
			}
		}
		System.out.println(str3);
		
	}
}
