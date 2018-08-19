package com.dspl.CollectionPragrams;
import java.util.*;
public class EmployeeApplication 
{
	public static void main(String args[])
	{
		EmployeeSort e1=new EmployeeSort(101, "yogesh", "giri", "BCA");
		EmployeeSort e2=new EmployeeSort(102, "rahul", "suryawanshi", "BCA");
		EmployeeSort e3=new EmployeeSort(103, "vishal", "more", "BCA");
		EmployeeSort e4=new EmployeeSort(104, "bharat", "aeer", "MCA");
		EmployeeSort e5=new EmployeeSort(105, "kaustubh", "kasar", "MCA");
		EmployeeSort e6=new EmployeeSort(106, "tejas", "thorave", "MSC");
		
		//List <EmployeeSort> al=new ArrayList<EmployeeSort>();
		Set al=new HashSet<EmployeeSort>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		al.add(e6);
		
		List <EmployeeSort> a=new ArrayList<EmployeeSort>(al);
		
		a.sort(new Comparator<EmployeeSort>(){
			public int compare(EmployeeSort e1, EmployeeSort e2) 
			{
				int cmp;
				cmp=e1.getDeptName().compareTo(e2.getDeptName());
				if(cmp==0)
				{
					cmp=e1.getFirstName().compareTo(e2.getFirstName());
				}
				return cmp;
			}
		});
		Set <EmployeeSort> ts=new LinkedHashSet<EmployeeSort>(a);
		
		for(EmployeeSort es:a)
		{
			System.out.println(es.getDeptName()+", "+es.getFirstName());
		}
		/*Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
	}
}
