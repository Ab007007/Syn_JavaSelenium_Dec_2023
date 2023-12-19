package com.syn.jt.methods;

public class OverloadingDemo {

	/*
	 * [access specifiers] [access modifiers] return_type method_name([arguments]) 
	 * {
	 * 			IMPLEMENTATION 
	 * }
	 */
	void add() 
	{
		System.out.println("Adding numbers");
	}
	
	void add(int a, int b) 
	{
		System.out.println("Sum of two integers is " + (a+b));
	}
	
	void add(double a, double b) 
	{
		System.out.println("Sum of two Double is " + (a+b));
	}
	
	
	void add(String  a, String  b) 
	{
		System.out.println("Full Name of a person is " + (a + " " + b));
	}
	
	public static void main(String[] args) {
		
		OverloadingDemo ad = new OverloadingDemo();
		ad.add();
		ad.add(55, 555);
		ad.add("Soumya", "Roy");
		ad.add(55.55, 555.22);
		
	}
}
