package com.dspl.interfaceExamples;

public class Test extends test2 implements Interface1,Interface2,Interface3
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("m2 method");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
	}
}
