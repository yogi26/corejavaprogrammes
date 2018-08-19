package IOPractice;
import java.util.*;
public class StackApplication 
{
	public static void main(String args[])
	{
		Stack stackObject=new Stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		
		int cnt1=0;
		for(int i=0;i<str.length();i++)
		{
			stackObject.push((Character)str.charAt(i));
		}
		for(int i=0;i<str.length();i++)
		{
			Character s=(Character)stackObject.pop();
			if(s.equals('}'))
			{
				cnt1++;
			}
			else if(s.equals('{'))
			{
				cnt1--;
			}
			else
			{
				
				System.out.println("Invalid String entered");
				cnt1++;
				break;
			}
		}
		if(cnt1==0)
		{
			System.out.println("Valid");
		}
	}
}
