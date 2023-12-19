package com.syn.jt.access.pack2;

import com.syn.jt.access.pack1.A;

public class C extends A {

	
	public static void main(String[] args) {
	
		C a = new C();
	//	System.out.println(a.privateVariable);
	//	System.out.println(a.defaultVariable);
		System.out.println(a.protectedVariable);
		System.out.println(a.publicVariable);

	
	//	a.privateTest();
	//	a.defaultTest();
		a.protectedTest();
		a.publicTest();
	}
}
