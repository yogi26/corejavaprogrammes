package com.dspl.statement;

public class StringOperation 
{
	public int occurences(String str,String str2)
	{
		String s []= str.split(" ");
		int cnt=0;
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(str2))
			{
				cnt++;
			}
		}
		return cnt;
	}
	public void stringReplace()
	{
		String str="Building java programms java";
		String str2;
		str2=str.replace("java", "Spring");
		System.out.println("Original String  : "+str);
		System.out.println("After Replace    : "+str2);
	}
	public boolean stringPalindrome(String s1)
	{
		int i,f=0;
		int k=s1.length();
		
		for(i=0;i<s1.length();i++)
		{
			if(i!=k)
			{
				k--;
				if(s1.charAt(i)!=s1.charAt(k))
				{
					f=1;
					break;
				}	
			}
		}
		if(f==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
