package com.dspl.TestCode;

public class TestApplication 
{
	public static void main(String args[])
	{
		Object p[]=new Object[10];
		p[0]=new Student();
		p[1]=new Employee();
		p[2]=new Person();
		p[3]=new Animal();
		p[4]=new Dog();
		p[5]=new Tiger();
		p[6]=8;
		p[7]=8.8;
		p[8]=true;
		p[9]='c';
		System.out.println(p[7]);
		
	}
}
