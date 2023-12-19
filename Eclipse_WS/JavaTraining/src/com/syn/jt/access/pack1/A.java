package com.syn.jt.access.pack1;

public class A 
{
	public static void main(String[] args) {
		test();
		
		A a = new A();
		System.out.println(a.privateVariable);
		System.out.println(a.defaultVariable);
		System.out.println(a.protectedVariable);
		System.out.println(a.publicVariable);

	
		a.privateTest();
		a.defaultTest();
		a.protectedTest();
		a.publicTest();
	}
	
	
	public static void test()
	{
		A a = new A();
		System.out.println(a.privateVariable);
		System.out.println(a.defaultVariable);
		System.out.println(a.protectedVariable);
		System.out.println(a.publicVariable);

	
		a.privateTest();
		a.defaultTest();
		a.protectedTest();
		a.publicTest();
	}
	private int privateVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	public int publicVariable = 40;
	
	
	
	private void privateTest()
	{
		System.out.println("Private Method ");
		
	}
	
	void defaultTest()
	{
		System.out.println("Default Method ");
		
	}
	
	protected void protectedTest()
	{
		System.out.println("protected Method ");
		
	}
	
	public void publicTest()
	{
		System.out.println("public Method ");
		
	}
	
	
	
	
}

