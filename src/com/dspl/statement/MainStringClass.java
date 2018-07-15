package com.dspl.statement;

public class MainStringClass {

	public static void main(String[] args) 
	{
		StringOperation op=new StringOperation();
		
		int no_of_oc=op.occurences("\njava programs java","java");
		System.out.println("\nNo of occurences are : "+no_of_oc);
		
		op.stringReplace();
		
		//boolean b=;
		if(op.stringPalindrome("MADAMA"))
		{
			System.out.println("\nString is palindrome");
		}
		else
		{
			System.out.println("\nString is not palindrome");
		}
	}

}
