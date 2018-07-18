package com.dspl.statement;

public class Encryption 
{
	StringBuilder str=new StringBuilder("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
	
	public String getEncryptedMsg(String str2, int key)
	{	
		StringBuilder str3=new StringBuilder();
		int f=0;
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str2.charAt(i)==str.charAt(j))
				{
					str3.append(str.charAt(j+key));
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
		return str3.toString();
	}
	public String getdecryptedMsg(String str2,int key)
	{
		str=str.reverse();
		
		StringBuilder str3=new StringBuilder();
		int f=0;
		for(int i=0;i<str2.length();i++)
		{
			for(int j=0;j<str.length();j++)
			{
				if(str2.charAt(i)==str.charAt(j))
				{
					str3.append(str.charAt(j+key));
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
		return str3.toString();
	}
}

