package PracticeTest;

public class ArrayOperation
{
	int i,j,flag=0;
	public void search(int a[],int num)
	{
		for(i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
			
		}
		if(flag==1)
		{
			System.out.println(num+ " Number is found");
		}
		else
		{
			System.out.println(num+ " Number is not found");
		}
		
	}
	public void sort(int a[])
	{
		
		int t;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}	
	}
	public void missing(int a[])
	{	
		int len=a.length,s=0,res=0;
		for(i=0;i<len;i++)
		{
			s+=a[i];
		}
		res=len*(len+1)/2;
		System.out.println(res-s);
	}
}
