package com.dspl.CollectionPragrams;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<EmployeeSort>
{
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
}
