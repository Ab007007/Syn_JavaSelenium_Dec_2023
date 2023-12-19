package com.syn.jt.access.pack1;

public class B {

	
	public static void main(String[] args) {
	
		
		A a = new A();
		System.out.println(a.defaultVariable);
		System.out.println(a.protectedVariable);
		System.out.println(a.publicVariable);

	
		a.defaultTest();
		a.protectedTest();
		a.publicTest();
	}
}
