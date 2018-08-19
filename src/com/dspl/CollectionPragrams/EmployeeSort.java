package com.dspl.CollectionPragrams;

public class EmployeeSort
{
	private int empId;
	private String firstName;
	private String lastName;
	private String deptName;
	public EmployeeSort(int empId, String firstName, String lastName, String deptName)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.deptName=deptName;
	}
	public int getEmpId()
	{
		return empId;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public String getDeptName()
	{
		return deptName;
	}
	public String toString()
	{
		return "Emp Id :"+empId+", First Name : "+firstName+", Last Name : "+lastName+", Dept Name :"+deptName;	
	}
	
}
