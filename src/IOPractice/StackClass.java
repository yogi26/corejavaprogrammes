package IOPractice;
import java.util.*;
public class StackClass 
{
	Stack obj=new Stack();
	String s;
	public void push(Character s)
	{
		obj.push(s);
	}
	public String pop()
	{
		if(!obj.empty())
		{
			s=(String)obj.pop();
		}
		else
		{
			System.out.println("Stack is Empty");
		}
		return s;
	}
	
}
