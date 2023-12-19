package com.syn.jt.variables;

public class VariablesDemo {

	static String name = "aravinda";
	
	public static void main(String[] args) 
	{
		int age = 33;
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		test1();
		test2();
	}
	
	public static void test1()
	{
		System.out.println("Name from test1 : " + name);
	}
	
	public static void test2()
	{
		System.out.println("Name from test2 : " + name);
	}

}
